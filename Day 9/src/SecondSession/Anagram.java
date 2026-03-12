package SecondSession;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args){
        String s1 = "listen";
        String s2 = "silent";

        char[] c1 = s1.toLowerCase().toCharArray();
        char[] c2 = s2.toLowerCase().toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1,c2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }

}
