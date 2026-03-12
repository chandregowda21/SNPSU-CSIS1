/*import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;*/
import java.util.*;
public class Panagram {
    public static void main(String[] args){
        String s = "pack my box with five dozen of liquer jugs";
        HashSet hs = new HashSet();

       for(char c : s.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                hs.add(c);
            }
        }

            if(hs.size()==26){
                System.out.println("panagram");
            }
            else{
                System.out.println("not panagram");
            }

    }
}
