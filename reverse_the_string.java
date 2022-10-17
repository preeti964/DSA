package recursion;

import java.util.Scanner;

public class reverse_the_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();
        String rev="";
        System.out.println(reverse(str,str.length()-1,rev));
    }
    static String reverse(String str,int n,String s) {
        if (n <= 0) {
            s = s + str.charAt(n);
            return s;
        }
        s=s+str.charAt(n);
        return reverse(str, n - 1,s);
    }
    }

