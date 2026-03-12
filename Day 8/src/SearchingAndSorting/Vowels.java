package SearchingAndSorting;

public class Vowels {
    public static void main(String[] args){
        String s = "chandu";
        int count=0;
        for (int i=s.length()-1;i>=0;i--){
            char c = s.toLowerCase().charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
