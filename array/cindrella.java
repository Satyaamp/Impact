import java.util.Scanner;

public class cindrella {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int arr1[] = new int[m];
        for(int i = 0; i<m;i++){
            arr1[i]= sc.nextInt();
        }

        int n = sc.nextInt();
        int arr2[] = new int[n];

        for(int j = 0; j <n; j++){
            arr2[j] = sc.nextInt();
        }


        int sum1 = 0;
        for(int i = 0; i<m ; i++){
            sum1+= arr1[i];
        }
        int sum2 = 0;
        for(int j = 0; j <n; j++ ){
            sum2+= arr2[j];

        }

        if(sum1 == sum2 && n == m){
            System.out.println("Smae");
        }else{
            System.out.println("Not smae");
        }
    }
}
