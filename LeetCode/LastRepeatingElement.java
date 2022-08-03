package Array.LeetCode;

public class LastRepeatingElement {
    public static void main(String[] args) {
         int arr[] = {1 ,3,4,5,3,6,5};
         int res = lastRepeatingEle(arr);
        System.out.println(res);
    }
    public static int lastRepeatingEle(int arr[]){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                  temp=j;
                }
            }
            if(i>temp) {
                temp = i;
            }
        }
        return arr[temp];
    }
}
