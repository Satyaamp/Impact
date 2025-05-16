// import java.util.Scanner;

// public class decimal_binary {
//  public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();

//     // String s = "";

//     // while(n>0){
//     //     int r = n%2;
//     //     s = r+s;
//     //     n/=2;
//     // }

//     // System.out.println(s);

//     int rev = 0;
//     while(n!=0){
//         int r = n%2;
//         rev = rev*10+r;
//         n/=2;
//     }

//     System.out.println(rev);
//     int rev1=0;
//     while (rev!=0) {
//         int r1= rev%10;
//         rev1= rev1*10+r1;
//         rev/=10;
        
//     }
//     System.out.println(rev1);
    
//  }   
// }


import java.util.Scanner;

public class decimal_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int binary = 0;
        int place = 1;

        while(n>0){
            int ld =n%2;
            binary+= ld*place;
            place*=10;
            n/=2;
        }
        System.out.print(binary);
    }
}
