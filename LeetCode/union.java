package Array.LeetCode;
import java.util.*;
public class union {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {1,4,6,7,8,9};
        Set<Integer> s= new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            s.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            s.add(arr2[i]);
        }
        System.out.print(s);
    }
}
