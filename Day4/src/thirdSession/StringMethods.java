package thirdSession;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter a string");
        String input = s.nextLine();
        //length()
        System.out.println("length "+ input.length());
        //toUpperCase()
        System.out.println("Uppercsase "+input.toUpperCase());
        //toLowererCase()
        System.out.println("Lowercsase "+input.toLowerCase());
        //charAt(index)
        System.out.println(input.charAt(2));
        //subString
        System.out.println(input.substring(0,4));
        //concat or +
        String str = "Cannon Bolt";
        System.out.println("concat "+input.concat(str));
        System.out.println(input+str);
        //equals()
        System.out.println(input.equals("ben 10"));
        //equalsIgnoreCase()
        System.out.println(input.equalsIgnoreCase("chndu"));
        //replace(old,new)
        System.out.println(input.replace("10","20"));
        //10.trim
        System.out.println(input.trim());
        //startWith()
        System.out.println(input.startsWith("c"));
        //endwith()
        System.out.println(input.endsWith("u"));
        //indexof()
        System.out.println(input.indexOf("u"));
        //compareTo
        System.out.println(input.compareTo("Ben 10"));
        //split
        String[] words = input.split(" ");
        for(String word : words){
            System.out.println(word);
        }
        //isLetter and isDigit
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if(Character.isLetter(c)){
                System.out.println("is letter");
            }
            else if(Character.isDigit(c)){
                System.out.println("its a digit");
            }
            else{
                System.out.println("Nor a leter nor a digit");
            }
        }

    }
}
