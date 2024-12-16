package com.example;

import java.util.List;

public class Lion {

    private Breedable breedable;
    private FoodConsumer foodConsumer;
    boolean hasMane;

    public Lion(String sex, Breedable breedable, FoodConsumer foodConsumer) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }

        this.breedable = breedable;
        this.foodConsumer = foodConsumer;
    }

    public int getKittens() {
        return breedable.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return foodConsumer.getFood("Хищник");
    }
}
