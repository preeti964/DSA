package Array.LeetCode;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
//        int res =removeDuplicates(arr);
//        System.out.println(res);
          removeDup(arr);
    }
    public static int removeDuplicates(int[] nums) {
        int count =1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[count] = nums[i+1];
                count++;
            }
        }
        return count;
    }

    public static void removeDup(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
//        for(int ele : set){
//            System.out.print(set + " ");
//        }
        System.out.println(set);
    }
}