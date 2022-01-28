package org.example;

public abstract class Grandma {
    public Grandma(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    String name;

     public abstract boolean likesWord(String str);


}
