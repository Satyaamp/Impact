import java.util.*;
public class Q16_ACC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int m = sc.nextInt();
        
        int q = num/m;

        int lb = q*m;
        int up = (q+1)*m;

        int dist1 = num-lb;
        int dist2 = up-num;

       if(dist1 == dist2){
        System.out.println(up);
       }else if(dist1<dist2){
        System.out.println(lb);
       }else{
        System.out.println(up);
       }
    }
}
