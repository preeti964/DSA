package recursion;

public class M_power_N {
    public static void main(String[] args) {
        System.out.println(  pow(3,4));

    }
    static int pow(int m,int n)
    {
        if(n==0)
            return 1;
       int temp=pow(m,n/2);
       if((n&1)==1)  // n is odd
        return  temp*temp*m;
       return temp*temp;
    }
}
