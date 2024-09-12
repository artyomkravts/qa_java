package com.example;

import java.util.Arrays;
import java.util.List;

public class Alex extends Lion {

    private Feline feline;

    public Alex(Feline feline) throws Exception {
        super("Самец", feline);
        this.feline = feline;
    }

    public List<String> getFriends() {
        return Arrays.asList("Marty", "Gloria", "Melman");
    }

    public String getPlaceOfLiving() {
        return "New York Zoo";
    }

    @Override
    public int getKittens() {
        return feline.getKittens(0);
    }
}
