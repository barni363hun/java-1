
class Music{
    //zenekar neve
    String band;
    //szám írója
    String writer;
    //eredeti-e vagy feldolgozás
    boolean isOriginal;
    //4.feladat
    int lenghtSec;
    //4.feladat
    String title;

    Music(String band, String writer,boolean isOriginal,int lenghtSec,String title){
        this.band = band;        
        this.writer = writer;
        this.isOriginal = isOriginal;
        this.lenghtSec = lenghtSec;
        this.title = title;
    }
}

