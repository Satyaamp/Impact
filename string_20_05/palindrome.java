

public class palindrome {
    public static void main(String[] args) {
        String sr = "Anna";
        String empty = "";
        
        for (int i = sr.length() - 1; i >= 0; i--) {
            empty += sr.charAt(i);
        }
        if (sr.equalsIgnoreCase(empty)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
