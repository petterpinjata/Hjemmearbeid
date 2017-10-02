package com.company;

//TIPS: alt + enter på PetRock i public class => lage tester
// alt + insert => lager konstruktører og getters raskt!

public class PetRock {
    private String navn;
    private boolean happy = false;

    public PetRock(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public boolean isHappy() {
        return happy;
    }

    public void playWithRock() {
        happy = true;
    }
}
