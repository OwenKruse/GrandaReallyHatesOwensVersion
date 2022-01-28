package org.example;

public class Evenly extends Grandma {
    public Evenly() {
        super("Evenly");
    }

    @Override
    public boolean likesWord(String str) {
        int t = 1;

        if (str.length() == 0) {

            return true;

        } else {
            if((str.length() % 2) == 0){
                return false;
            }
        }
        return true;
    }
}
