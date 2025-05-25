package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LionAlex extends Lion {

    //Создание списка друзей Алекса
    Map <String, String> alexFriends;


    public LionAlex (String sex, Feline feline) throws Exception {
        super("Самец", feline);

        this.alexFriends = new HashMap<>();
        this.alexFriends.put("Марти", "зебра");
        this.alexFriends.put("Глория", "бегемот");
        this.alexFriends.put("Мелман", "жираф");

    }


    public List <String> getAlexFriends() {
        return new ArrayList<>(alexFriends.keySet());
    }


    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }


}
