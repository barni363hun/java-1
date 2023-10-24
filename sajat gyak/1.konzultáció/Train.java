class Train {
    private int cartEnd = 0;
    
    private Locomotive locomotive;
    private Cart[] carts;
    private Station departure, terminal;

    public Train(Locomotive l) {
        this.locomotive = l;
        carts = new Cart[5];
    }

}
