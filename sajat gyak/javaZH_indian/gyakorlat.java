class Gyakorlat{
    public static void  main(String[] args){
        Gyakorlat gyak = new Gyakorlat();
        int res =0;
        res = gyak.nSum(1);
        System.out.println(""+res);
        res = gyak.nSum(5);
        System.out.println(""+res);
        res = gyak.nSum(10);
        System.out.println(""+res);
        res = gyak.nSum(100);
        System.out.println(""+res);
        res = gyak.nSum(10000);
        System.out.println(""+res);
        String[] sArray = new String[]{"Java", "Object", "Class","Compiler"};
        for(int i = 0; i < sArray.length; i++){
            if(i%2==1){
                System.out.println(Character.toUpperCase(sArray[i].charAt(0))+sArray[i].substring(1));
            }
            else{
                System.out.println(Character.toLowerCase(sArray[i].charAt(0))+sArray[i].substring(1));
            }
        }
        gyak.playlistTester();
    }
    public void start(){
        System.out.println("asd");
    }

    public int nSum(int n){
        return (n*(n+1))/2;
    }

    public void playlistTester(){
        Playlist p = new Playlist(new Music[]{
            new Music("HBB","Földes László",true,250,"Indulnod kell!"),
            new Music("Beatles","John Lenon",true,400,"Yellow Submarine"),
            new Music("ACDC","Váltóáram",false,300,"TwoDeersTruck")
            });
        p.printPlaylist();
    }

    public void readInPlaylist(){
        Playlist p = new Playlist("asd.txt");
        p.printPlaylist();
    }

}
