/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zarthelyi;

/**
 *
 * @author HALLGATO
 */
public class Video extends Media {

    private String videoName;
    private int playTime;
    private int quality;
    private int fps;

    public Video(String name, int size, String path, String videoName, int playTime, int quality, int fps) {
        super(name, size, path);
        this.videoName = videoName;
        this.playTime = playTime;
        this.quality = quality;
        this.fps = fps;
    }

    public void play() {
        System.out.println("Playing " + videoName + "...");
    }

    public String toFile() {
        return name + ";" + size + ";" + path + ";" + videoName + ";" + playTime + ";" + quality + ";" + fps;
    }

    @Override
    public String toString() {
        return name + " " + size + "bytes " + path + " " + videoName + " " + playTime + " seconds " + quality + "p " + fps + " fps";
    }

}
