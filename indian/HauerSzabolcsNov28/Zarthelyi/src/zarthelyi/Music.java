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
public class Music extends Media {

    private int playTime;
    private String artist;
    private String songName;

    Music(String name, int size, String path, int playTime, String artist, String songName) {
        super(name, size, path);
        this.playTime = playTime;
        this.artist = artist;
        this.songName = songName;
    }

    public void print() {
        System.out.println(name + " " + size + "bytes " + path + " " + playTime + " seconds " + artist + " - " + songName);
    }

    public void play() {
        System.out.println("Playing " + artist + " - " + songName + "...");
    }

    public String toFile() {
        return name + ";" + size + ";" + path + ";" + playTime + ";" + artist + ";" + songName;
    }

    @Override
    public String toString() {
        return name + " " + size + "bytes " + path + " " + playTime + " seconds " + artist + " - " + songName;
    }
}
