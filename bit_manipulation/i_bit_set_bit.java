import java.util.Scanner;

public class i_bit_set_bit {

    public static void main(String[] args) {
        // int n = 10111;
        // int i = 3;

        // int ans = 1<<i;

        // System.out.println(ans); //1<<i

        // int binary = 0;
        // int place = 1;

        // while(ans>0){
        //     int ld =ans%2;
        //     binary+= ld*place;
        //     place*=10;
        //     ans/=2;
        // }
        // System.out.println(binary); // 8--> 1000

        // System.out.println(n&binary);
        // if((n&binary)!=0){
        //     System.out.print("SET!");
        // }else{
        //     System.out.print("NOT");
        // }


        // // while(i>=0){
        // //     n/=10;
        // //     i--;
        // // }
        // // System.out.println(n);
        // // int ld = n%10;
        // // System.out.println(ld);
        // // if(ld ==1){
        // //     System.out.print("SET BIT");
        // // }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter ith bit to check: ");
        int i = sc.nextInt();

        // Using left shift
        // if((n&(1<<i))!=0){
        //     System.out.println("Set bit");
        // }else{
        //     System.out.println("Not set bit");
        // }
        
        //Uisng right shift
        if((1&(n>>i))!=0){
            System.out.println("Set bit");
        }else{
            System.out.println("Not set bit");
        }



        
    }
}
