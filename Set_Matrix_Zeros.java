package striver;

import java.util.Scanner;

public class Set_Matrix_Zeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        bootforce(arr);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    static void bootforce(int[][] arr)
    {
        int rows=arr.length,cols=arr[0].length;
        for(int i=0;i<rows;i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == 0) {
                    for (int k = 0; k < rows; k++)
                        if (arr[k][j] != 0)
                            arr[k][j] = -1;
                    for (int l = 0; l < cols; l++)
                        if (arr[i][l] != 0)
                            arr[i][l] = -1;
                }
            }
        }
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++)
            {
                {
                    if(arr[i][j]==-1)
                        arr[i][j]=0;
                }
            }
        }
    }
    static void optimal1(int[][] arr)
    {

    }
    static  void optimal2(int[][] arr)
    {
        boolean col0=true;
        int rows=arr.length,cols=arr[0].length;
        for(int i=0;i<rows;i++)
        {
            if(arr[i][0]==0)
                col0=false;
            for(int j=1;j<cols;j++)
            {
                if(arr[i][j]==0)
                {
                    arr[i][0]=arr[0][j]=0;
                }
            }
        }
        for(int i=rows-1;i>=0;i--)
        {
            for(int j=cols-1;j>=1;j--)
            {
                if(arr[i][0]==0 || arr[0][j]==0) {
                    arr[i][j] = 0;
                }
            }
            if(col0==false)
            {
                arr[i][0]=0;
            }
        }

    }
}
