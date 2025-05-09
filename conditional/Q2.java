import java.util.*;
public class Q2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enetr number: ");
		int n = sc.nextInt();
		
		if (n %2 != 0){
		    System.out.println("Weired");
		}else if( n%2 ==0 & n>=2 & n<=5){
		    System.out.println("Not Weired");
		}else if(n % 2 == 0 & n>= 6 & n<= 20){
		    System.out.println("Weired");
		}else if( n %2 == 0 & n > 20){
		    System.out.println("Not Weired");
		}else{
		    System.out.print("Invalid");
		}
	}
}