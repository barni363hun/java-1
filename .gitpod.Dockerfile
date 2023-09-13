FROM gitpod/workspace-full

USER gitpod

# Install wget and other dependencies
RUN sudo apt-get update && \
    sudo apt-get install -y wget && \
    sudo apt-get clean && \
    sudo rm -rf /var/lib/apt/lists/* /tmp/* /var/tmp/*

# Download Java 8 from Oracle
RUN wget -q --no-check-certificate --no-cookies --header "Cookie: oraclelicense=accept-securebackup-cookie" \
    -O /tmp/jdk8.tar.gz \
    "https://download.oracle.com/otn-pub/java/jdk/8u111-b14/jdk-8u111-linux-x64.tar.gz"

# Extract and install Java 8
RUN sudo mkdir -p /usr/lib/jvm && \
    sudo tar -xf /tmp/jdk8.tar.gz -C /usr/lib/jvm && \
    sudo rm /tmp/jdk8.tar.gz && \
    sudo update-alternatives --install /usr/bin/java java /usr/lib/jvm/jdk1.8.0_111/bin/java 100 && \
    sudo update-alternatives --install /usr/bin/javac javac /usr/lib/jvm/jdk1.8.0_111/bin/javac 100

# Set default Java version to 1.8
RUN sudo update-alternatives --set java /usr/lib/jvm/jdk1.8.0_111/bin/java && \
    sudo update-alternatives --set javac /usr/lib/jvm/jdk1.8.0_111/bin/javac
