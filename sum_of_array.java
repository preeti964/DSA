package recursion;

public class sum_of_array {
    public static void main(String[] args) {
        int[] arr={1,1,1};
        System.out.println(sum(arr,arr.length-1));
    }
    static int  sum(int[] arr,int n)
    {
        if(n<0)
            return 0;
        return arr[n]+sum(arr,n-1);
    }
}
