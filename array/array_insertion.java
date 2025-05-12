import java.util.Scanner;

public class array_insertion {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        System.out.print("Enter elements of array: ");
        int arr[] = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter position to insert new element: ");
        int pos = sc.nextInt();

        System.out.print("Enter new element: ");
        int ele = sc.nextInt();


        for(int idx = 0; idx<n;idx++){
            if(idx == (pos-1)){
                // arr[idx] = ele;
                System.out.print(ele+" ");
            }
            System.out.print(arr[idx]+" ");
        }


        

        
    }
}
