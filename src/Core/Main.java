/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import Util.ArrayBuilder;

/**
 *
 * @author ashif
 */
public class Main {

    public static void main(String[] args) {
        ArrayBuilder ab = new ArrayBuilder();
        ab.addObjects('A');
        ab.addObjects("Hello2");
        ab.addObjects(1.3);
        ab.addObjects("Hello");
        ab.addObjects("Hello2");
        ab.addObjects(1);

        ab.display();

        System.out.println(ab.getItem(2));
    }
}
