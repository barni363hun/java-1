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
public class Media {

    protected String name;
    protected int size;
    protected String path;

    Media(String name, int size, String path) {
        this.name = name;
        this.size = size;
        this.path = path;
    }

    public void play() {
    }

    public String toFile() {
        return "";
    }

    public void print() {
        System.out.println("mediaPrint");
    }
}
