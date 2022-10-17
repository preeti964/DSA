package recursion;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
//        System.out.println( ispalin(a,0,a.length()-1));
        int k=((a.length()-1)/2);
        System.out.println(palin(a,k,0));
    }
    static boolean ispalin(String a,int l,int h)
    {
        if(l>=h)
            return (true);
        if(a.charAt(l)==a.charAt(h))
            return ispalin(a,l+1,h-1);
        return false;
    }

    static boolean palin(String s,int k,int n)
    {
        // t(n) =o(n/2)
        System.out.println(n+" "+ (s.length()-1-n));
        if(n>k)
            return true;
        if(s.charAt(n)!=s.charAt(s.length()-1-n))
            return false;
        return palin(s,k,n+1);
    }

}
