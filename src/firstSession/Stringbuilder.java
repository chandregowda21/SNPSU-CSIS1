package firstSession;

import java.util.Scanner;

public class Stringbuilder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder(input);
        //append
        sb.append("chandu");
        System.out.println(sb);

        //replace
        sb.replace(3,7,"sapthagiri");
        System.out.println(sb);

        //reverse
        sb.reverse();
        System.out.println(sb);
    }
}
