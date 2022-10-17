package recursion;

public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println(rpower(5));
    }
    static  int rpower(int n)
    {
        if(n==0)
            return 1;
        int smallerprobem=rpower(n-1);
        int biggerproblem=2*smallerprobem;
        return biggerproblem;
    }
}
