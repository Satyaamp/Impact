import java.util.*;
public class pair_container {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int []arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); 

        int left = 0;
        int right = n-1;

        while(left<right){
            System.out.println(arr[right]+ " "+ arr[left]);
            left++;
            right--;
        }

        if(n%2!=0){
            System.out.println(arr[left]+" "+"0");
        }


    }
}
