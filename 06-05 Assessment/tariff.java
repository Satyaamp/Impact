import java.util.Scanner;
public class tariff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Entr month b/w 1-12: ");
        int month = sc.nextInt();


        System.out.print("Room rent per day: ");
        int rentpday = sc.nextInt();

        System.out.print("No of days stayed in hotel: ");
        int days = sc.nextInt();

        if (month<1 || month>12){
            System.out.println("Invalid month");
            return;
        }

        int total = days*rentpday;

        if((month>=4 && month<=6) || month==11 || month==12){
            total += (20*total)/100;

        }

        System.out.println("Total bill: " + total);
    }
    
} 
