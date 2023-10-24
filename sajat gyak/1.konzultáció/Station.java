//package 1.konzultáció;

class Station {
    private String name;
    private int latitude;
    private int longitude;
    
    public Station(String name, int latitude, int longitude){
        this.name = name;
        this.longitude = longitude;
    }

    public String getName(){
        return this.name;
    }

}

