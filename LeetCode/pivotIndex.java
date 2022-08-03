package Array.LeetCode;

import java.util.Scanner;

public class pivotIndex {
    public static  int pivotIdx(int[] arr) {
        int sum = 0;
        int n= arr.length;
        for (int x: arr)
            sum += x;
        int lsum=0,rsum=sum;
        for(int j=0;j<n;j++)
        {
            rsum-=arr[j];
            if(lsum==rsum)
            {
                return j;
            }
            lsum+=arr[j];
        }
        return -1;
    }

    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 1,7,3,6,5,6
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res = pivotIdx(arr);
        System.out.println(res);
    }
}
