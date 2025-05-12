import java.util.Scanner;

public class Leetcode_88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int nums1[] = new int[m];
        int nums2[] = new int[n];

        for(int i = 0;i<m;i++){
            nums1[i] = sc.nextInt();
        }

        for(int i = 0; i<n;j++){
            nums2[i] = sc.nextInt();
        }

        int merge = m+n;
        int nums3[] = new int[merge];

        int i,j,k = 0;

        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
            nums3[k] = nums1[i];
            i++;
        }
        else{
            nums3[k] = nums2[j];
            j++;
        }
        k++;
        }

        








        

    }
}
