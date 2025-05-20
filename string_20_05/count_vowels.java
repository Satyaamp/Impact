public class count_vowels {
    public static void main(String[] args) {
        String sr = "Satyam";

        String vowels="aeiouEIOU";

        int count=0;

        for(int i = 0;i<sr.length();i++){
            if(vowels.indexOf(sr.charAt(i))!=-1)
            count++;
        }

        System.out.println(count);





    }
}
