public class non_repeated_element {
    public static void main(String[] args) {

        int arr[]={12,11,12};

        int res= arr[0];

        for(int i=1;i<arr.length;i++){
            res = res^arr[i];
        }

        System.out.println(res);
        




    }
}
