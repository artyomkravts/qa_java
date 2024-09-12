package com.example;

import java.util.Arrays;
import java.util.List;

public class Alex extends Lion {

    private Feline feline;

    public Alex(String sex, Feline feline) throws Exception {
        super("Самец", feline);
    }

    public List<String> getFriends() {
        return Arrays.asList("Gloria", "Melman", "Marty");
    }

    public String getPlaceOfLiving() {
        return "New York Zoo";
    }

    @Override
    public int getKittens() {
        return feline.getKittens(0);
    }
}
