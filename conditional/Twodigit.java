import java.util.*;

public class Twodigit{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number < 20){
            System.out.println("Less than 20");
        } else if(number > 20 && number % 2==0 ){
            System.out.println("Even ");
        } else if(number > 20 && number % 2 != 0){
            System.out.println("Odd");
        }else {
            System.out.println("Invalid ");
        }
      
    }
}