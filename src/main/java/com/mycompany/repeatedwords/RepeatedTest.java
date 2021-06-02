/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.repeatedwords;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Administrador
 */
public class RepeatedTest {

    public static void main(String[] args) {
        String param1 = "Bad programmers worry about the code. Good programmers worry about data structures and their relationship";
        String[] param2 = {"about", "and"};
        String[] c = param1.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < c.length; i++) {
            if (!c[i].equals(param2[0]) && !c[i].equals(param2[1])) {
                if (!map.containsKey(c[i])) {
                    map.put(c[i], 1);
                } else {
                    int y = map.get(c[i]) + 1;
                    map.put(c[i], y);
                }
            }
        }

        map.keySet().stream().filter(k -> (map.get(k) > 1)).forEachOrdered(k -> {
            System.out.println(k);
        });
    }

}
