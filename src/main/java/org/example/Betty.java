package org.example;

public class Betty extends Grandma {
    public Betty() {
        super("Betty");
    }

    @Override
    public boolean likesWord(String str) {

            int t = 1;

            if (str.length() == 0) {

                return true;

            } else {
                while (t != str.length()) {
                    if (str.charAt(t) == str.charAt(t - 1)) {

                        return false;

                    } else {
                        t++;
                    }
                }
                return true;
            }
        }
    }

