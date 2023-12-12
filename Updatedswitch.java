import java.sql.SQLOutput;

public class Updatedswitch {
    public static void main(String[] args){
        String day = "Sunday";
        String result = "";

         result = switch(day){
            case "Saturday", "Sunday" -> "6am";

            case "Monday" -> "8am";
            default ->  "7am";
        };
        System.out.println(result);

    }
}
