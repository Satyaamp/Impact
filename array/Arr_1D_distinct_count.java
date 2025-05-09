import java.util.Scanner;

public class Arr_1D_distinct_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int size = sc.nextInt();
        
        int arr[] = new int[size];

        System.out.println("Enter elements in array within size: ");

        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int count = 1;
        for(int i = 0; i<(size-1);i++){
            if(arr[i] != arr[i+1])
                count++;
        }
        System.out.println("Distinct elements: "+count);



        
    }
}
