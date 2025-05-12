import java.util.*;

public class compatible_array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1st Array
        System.out.print("Enter size of array1: ");
        int size1 = sc.nextInt();

        System.out.print("Enter elements ofarray1: ");
        int arr1[] = new int[size1];

        for(int i = 0;i<size1; i++){
            arr1[i] = sc.nextInt();
        }

        // 2nd Array
        System.out.print("Enter size of array2: ");
        int size2 = sc.nextInt();

        System.out.print("Enter elements of array2: ");
        int arr2[] = new int[size2];

        for(int j = 0; j<size2; j++){
            arr2[j] = sc.nextInt();
        }

        int count = 0;

        if(size1 == size2){
            for(int i = 0; i<size1;i++){
                if(arr1[i] >= arr2[i]){
                    count++;
                }
            }

            if(count == size1){
                System.out.println("Compatible");
            }else{
                System.out.println("Not");
            }
        }

        



    }
}