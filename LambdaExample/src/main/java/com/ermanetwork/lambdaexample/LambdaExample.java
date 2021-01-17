/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ermanetwork.lambdaexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Erman.Ag
 */
public class LambdaExample {
    
    Set<String> superAppSet = new TreeSet<>();
    List<String> myAppList = new ArrayList<>();

    public LambdaExample() {
        myAppList.add("JetBrains");
        myAppList.add("Eclipse");
        myAppList.add("Netbeans");
        myAppList.add("JDeveloper");
    }

    public void printStoreInventory() {
        myAppList.forEach(i -> System.out.println("My App item: " + i));
    }

    public void collectCycleItems() {
        myAppList.forEach(i-> {
            if (i.contains("Brain"))
                superAppSet.add(i);
        });
        
        superAppSet.forEach(i -> System.out.println("App: " + i));
    }
    
    public static void main(String[] args) {
        LambdaExample ld = new LambdaExample();
        ld.printStoreInventory();
        System.out.println("---------------------");
        ld.collectCycleItems();
    }
}
