import java.util.Scanner;

// 24-05-25 --> HackerRank

public class count_sum_no_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sr = sc.nextLine();
        int sum = 0;

        String emp ="";


        for(char c: sr.toCharArray()){
            if(Character.isDigit(c))
                emp+=c;
            else if(emp.length()>0){
                sum+= Integer.parseInt(emp);
                System.out.println(emp);
                emp="";
            }
        }
        System.out.println(emp);

        if(emp.length()>0)
        sum += Integer.parseInt(emp);
        System.out.println(sum);

    }
}
