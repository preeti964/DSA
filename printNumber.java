package recursion;

public class printNumber {
    public static void main(String[] args) {
        recursion(10);
    }
    static void recursion(int n)
    {
        if(n==1)
        {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        recursion(n-1);
//        System.out.println(n);
    }
}
