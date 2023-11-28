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
public class History {

    private List<Media> history = new ArrayList<>();

    History() {
    }

    public void add(Media m) {
        history.add(m);
    }

    public Media get(int index) {
        return history.get(index);
    }
}
