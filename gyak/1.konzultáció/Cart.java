//package 1.konzultáció;

class Cart {
    private String code;
    private int seats;
    
    public Cart(String code, int seats){
        this.code = code;
        this.seats = seats;
    }

    public String getCode(){
        return this.code;
    }

    public int getSeats(){
        return this.seats;
    }

}

