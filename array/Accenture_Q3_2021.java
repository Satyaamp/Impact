import java.util.Scanner;

public class Accenture_Q3_2021 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for(int i = 0;i<n;i++){
            int x = 1;
            int y = (int) Math.cbrt(arr[i]);
            while (x<=y) {
                int z = (x*x*x) + (y*y*y);
                if(z ==arr[i]){
                    count++;
                    break;
                }
                else{
                    if(z<arr[i]){
                        x++;
                    }else{
                        y--;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
