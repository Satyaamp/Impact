import java.util.Scanner;

public class two_sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();

        int []arr = new int[size];

        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int res[] = new int[2];

        // for(int i= 0;i<size;i++){
        //     for(int j = i+1; j<size;j++){
        //         if(arr[i]+arr[j] == target){
        //             res[0] = i;
        //             res[1] = j;
        //             break;
        //         }
        //     }
        // }
        for(int i =0;i<arr.length;i++){
            if(arr[i]+arr[i+1] ==target){
                res[0] =i;
                res[1]=i+1;
                break;
            }
        }

        for(int j = 0;j<res.length;j++){
            System.out.print(res[j]+" ");
        }
    }
    
}