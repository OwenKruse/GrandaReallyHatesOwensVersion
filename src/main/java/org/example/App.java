package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    static List<String> knownWords;

    public static void main(String[] args) {
        knownWords = new ArrayList<>();
        //This code below will populate the knownWords list with about 27,000 English words.
        try {
            BufferedReader br = new BufferedReader(new FileReader("common_words.txt"));
            String nextWord;
            while((nextWord = br.readLine()) != null) {
                knownWords.add(nextWord);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Hello, I'm Grandma Betty");

        int g = 5;
        while(g <= 5 ){
            Scanner s = new Scanner(System.in);
            System.out.println("Tell my a word. I let you know if I hate it or not.");
            String input = s.nextLine();
            if (hasDoubleLetters(input) == true) {
                g--;
                System.out.println("I hate that word.");
                System.out.println("You have " + g + " tries left.");
            } else {
                System.out.println("That word is okay.");
            }
            if(g == 0){
                System.out.println("You suck!");
                break;
            }
        }



    }

    /**
     * This method should return true if the given String has consecutive letters that are the same.
     * @param str -- the String in question.
     * @return true if str has any consecutive letters that are identical; false if not.
     */

    public static boolean hasDoubleLetters(String str) {
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
