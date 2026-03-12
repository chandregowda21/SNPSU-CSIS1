package SecondSession;

import java.util.*;
public class Isogram
{
    public static void main(String[] args) {
        String str = "lamp";
        boolean isIsogram = checkIsogram(str);
        if(isIsogram){
            System.out.println("The string is an isogram.");
        } else {
            System.out.println("The string is not an isogram.");
        }
    }

    public static boolean checkIsogram(String str) {
        Set<Character> letters = new HashSet<>();

        for(char ch : str.toLowerCase().toCharArray()) {
            if(Character.isLetter(ch)) { // Check if the character is a letter
                if(letters.contains(ch)) { // If the letter is already in the set, it's not an isogram
                    return false;
                }
                letters.add(ch); // Add the letter to the set
            }
        }

        return true; // If we finish checking without finding duplicates, it's an isogram
    }
}