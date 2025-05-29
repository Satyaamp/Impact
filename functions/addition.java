public class addition {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        addition obj = new addition();      
        int result = obj.add(5, 3);         
        System.out.println("Sum is: " + result);  
    }
}
