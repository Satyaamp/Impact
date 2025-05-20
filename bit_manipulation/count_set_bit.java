public class count_set_bit {
    public static void main(String[] args) {
        // int n= 10111;
        int n= 23;

        int count = 0;

        // 1. using modulus

        // while(n>0){
        //     int ld = n%10;
        //     n/=10;
        //     if(ld==1){
        //         count++;
        //     }

        // }
        // System.out.println(count);


        //2. without modulus
        while (n>0) {
            if((n&1)==1){
                count++;
            }
            n= n>>1;
        }
        System.out.print(count);
    }
}
