import java.net.Socket;
import java.nio.channels.Pipe.SourceChannel;
import java.util.Arrays;
import java.util.Scanner;

public class leetcode_136 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.printf("1st Appraoch using sorting: \n");

        int size = sc.nextInt();
        int []arr = new int[size];

        for(int i =0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        

        Arrays.sort(arr);
        for(int i =0;i<size;i++){
             System.out.print(arr[i]+" ");
        }
       
        int i =0;
        while(i<size-1){
            if(arr[i] == arr[i+1]){
                i+=2;
            }else{
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println(arr[size-1]);

        // System.out.printf("2nd Appraoch using XOR: \n");
        // int res = 0;
        // for(int num:arr){
        //     res^=num;
        // }
        // System.out.println(res);
        // return;
    }
}
