package recursion;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int t=3;
        System.out.println(bsearch(arr,0,arr.length-1,t));

    }
    static int bsearch(int[] arr,int l,int h,int t)
    {
        int mid=(l+h)/2;
        if(l>h)
            return -1;
        if(arr[mid]==t)
            return mid;
        if(arr[mid]>t)
            return bsearch(arr,l,mid-1,t);
        if(arr[mid]<t)
            return bsearch(arr,mid+1,h,t);
        return -1;
    }
}
