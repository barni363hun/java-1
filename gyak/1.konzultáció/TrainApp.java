import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

class TrainApp {
    private Train[] trains;
    public static void main(String[] args){
        new TrainApp().Test();
    }

    public void Test(){
        System.out.println("asd");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader r2 = new BufferedReader(new FileReader(new File("asd.txt")))
    }

}
