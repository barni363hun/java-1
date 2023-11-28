/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zarthelyi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HALLGATO
 */
public class Book extends Media {

    private String bookName;
    private List<String> pages = new ArrayList<>();

    public Book(String name, int size, String path, String bookName, List<String> pages) {
        super(name, size, path);
        this.bookName = bookName;
        this.pages = pages;
    }

    public void play() {
        System.out.println("Opening book: " + name + "...");
    }

    public String toFile() {
        String output = name + ";" + size + ";" + path + ";" + bookName;
        for (String page : pages) {
            output += ";" + page;
        }
        return output;
    }

    @Override
    public String toString() {
        return name + " " + size + "bytes " + path + " " + bookName + " Number of pages: " + pages.size();
    }

}
