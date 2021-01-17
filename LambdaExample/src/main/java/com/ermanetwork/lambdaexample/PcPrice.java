/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ermanetwork.lambdaexample;

/**
 *
 * @author Erman.Ag
 */
import java.util.Map;
import java.util.TreeMap;

public class PcPrice {
    private Map<String, Integer> fiyatList = new TreeMap<>();

    public PcPrice(){
        fiyatList.put("Apple", 30000);
        fiyatList.put("Asus", 20000);
        fiyatList.put("Lenova", 10000);
        fiyatList.put("HP", 2600);
        fiyatList.put("Casper", 400);
    }

    public void printPrices() {
        fiyatList.forEach((key, value) -> System.out.println("Pc Fiyat: " + key + ", $" + value));
    }
    
    public static void main(String[] args) {
        PcPrice f = new PcPrice();
        f.printPrices();
    }
}

