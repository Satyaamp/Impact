public class str {
    public static void main(String[] args) {
        String s = "Satyam";
        String s1 = "Satyam";
        String v = new String("Satyam");
        String v1 = new String("Satyam");

        // System.out.println(s==s1);
        // System.out.println(s==v);
        // System.out.println(s==v1);
        // System.out.println(v==v1);

        // System.out.println(s.equals(v1));

        //Most common methods
        
        System.out.println(s.charAt(0));//S
        System.out.println(s.indexOf("s"));//0
        System.out.println(s.concat(" parul best student")); //Satyam parul best student
        System.out.println(s.length()); //6
        System.out.println(s.contains("l"));//false
        System.out.println(s.toLowerCase());//satyam
        System.out.println(s.toUpperCase());//SATYAM
        System.out.println(s.repeat(2));//SatyamSatyam
        System.out.println(s.endsWith("yam")); // true
        System.out.println(s.startsWith("Sat")); //true
        System.out.println(s.trim());
        System.out.println(s.hashCode());
        System.out.println(s.toCharArray());

        
        StringBuilder sat = new StringBuilder(s);
        System.out.println(sat.delete(0,2));
        

        char ch ='A';
        char ch2 ='5';

        System.out.println(Character.isDigit(ch));//true
        System.out.println(Character.isDigit(ch2));//true

    }
}
