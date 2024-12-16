package com.example;

import java.util.List;

public class Alex extends Lion {


    public Alex(Breedable breedable, FoodConsumer foodConsumer) throws Exception {
        super("Самец", breedable, foodConsumer);
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }

}
