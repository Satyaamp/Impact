import java.util.*;

public class uniformly_matrix {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        
        int [][]arr = new int[m][m];
        
        for(int i =0;i<m;i++){
            for(int j =0;j<m;j++){ 
                arr[i][j] = sc.nextInt();
            }
        }
        int counteven = 0;
        int countodd = 0;
        
        for(int i = 0;i<m;i++){
            for(int j =0;j<m;j++){
                if(arr[i][j]%2==0){
                    counteven++;
                }else if(arr[i][j]%2!=0){
                    countodd++;
                }
            }
        }

        System.out.println(counteven);
        System.out.println(countodd);
        
        if(counteven == (m*m) || countodd == (m*m)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
        
    }
}