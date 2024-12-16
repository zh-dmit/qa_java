package com.example;

import java.util.List;

public class Lion {

    private Kittens kittens;
    private Food food;
    boolean hasMane;

    public Lion(String sex,  Feline feline) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }

        this.kittens = feline;
        this.food = feline;
    }

    public int getKittens() {
        return kittens.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return food.getFood("Хищник");
    }
}
