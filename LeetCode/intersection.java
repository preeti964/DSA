package Array.LeetCode;
import  java.util.*;
public class intersection {
    public static void main(String[] args) {
        int arr1[] ={1,2,3};
        int arr2[] = {3,4,5};
        int n= arr1.length;
        int m = arr2.length;
        int i=0,j=0;
        Set<Integer> a= new HashSet<>();
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                a.add(arr1[i]);
                i++;
                j++;
            }
        }
        for(int ele:a){
            System.out.print(ele + " ");
        }
    }
}
