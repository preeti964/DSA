package Array.LeetCode;
import java.util.*;
public class ContainsDuplicate {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int []arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    containDup(arr);
    if(containDuplicate(arr)){
        System.out.println("contains_duplicate");
    }
    else{
        System.out.println("not");
    }
    }
    // 1 2 2 3 4 4 5 5 6
    // 2 4 5
    public static void containDup(int []arr){

        for(int i=0;i<arr.length-1;i++){
            boolean flag= false;
            if(arr[i]==arr[i+1]){
                flag=true;
               // break;
                System.out.print(arr[i] + " ");
            }
        }
//        if(flag==true){
//            System.out.printf("Contains duplicate");
//        }
//        else{
//            System.out.println("Did not contains duplicate");
//        }
    }
    // Using hashset
    public static  boolean containDuplicate(int[] nums) {
        if(nums==null || nums.length==0)
            return false;

        HashSet<Integer> set = new HashSet<Integer>();
        for(int i: nums){
            if(!set.add(i)){
                return true;
            }
        }
        return false;
    }
}


