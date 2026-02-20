import java.util.Scanner;

public class Interview {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String day=s.nextLine();
        String typeofday=switch(day){
            case "mon", "tue", "wed", "thu","fri"-> "weekday";
            case  "sat", "sun" -> "weekend";
            default -> {
                if(day.isEmpty()){
                    yield "sorry no data given";
                }
                else{
                    yield "invalid data";                }
            }
        };
        System.out.println("typeofday : "+typeofday);

    }
}