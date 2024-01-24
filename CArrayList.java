package com.example.learn.dataStructures;

import java.util.ArrayList;
import java.util.Collections;

public class CArrayList {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Skoda");
        cars.add("Volkswagen");
        cars.add("Lexus");
        cars.add("Tesla");
        cars.add("Volvo");

        System.out.println(cars);
        System.out.println(cars.get(1));
        System.out.println(cars.remove(1));
        System.out.println(cars.get(0));

        Collections.sort(cars);

        cars.set(0, "Audi");
        cars.add(1, "BMW");

        System.out.println(cars);
        System.out.println(cars.size());

        for(int i=0; i<cars.size()-1; i++){
            System.out.println(cars.get(i));
        }
    }
}

// (add, get, set, remove) CRUD, size
// Both Array and ArrayList stores the object in a contiguous manner in the HEAP memory
