package org.example;

public class Ana extends Grandma {
    public Ana() {
        super("Ana");
    }

    @Override
    public boolean likesWord(String str) {
        int t = 1;

        if (str.length() == 0) {

            return true;

        } else {
            while (t != str.length()) {
                if (str.charAt(0) == str.charAt(str.length()-1)) {
                    return false;
                }
                else{
                        t++;
                    }
                }
            }
            return true;
        }
    }

