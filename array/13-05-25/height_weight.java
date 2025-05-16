import java.util.Scanner;

public class height_weight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int size = num*2;
        int arr[] = new int[size];

        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }


        int max_h_i = 0;
        int max_w_i = 0;
        int max_h = arr[0];
        int max_w = arr[1];
        
        for(int i = 0;i<size;i++){
            if(i%2==0){
                if(arr[i]> max_h){
                    max_h = arr[i]; 
                    max_h_i =i;
                }else{
                    if(arr[i]> max_w){
                    max_w = arr[i]; 
                    max_w_i =i;
                } }
            }
            
        }
        System.out.println((max_h_i/2)+1);
        System.out.println((max_w_i/2)+1);

    }
    
}
