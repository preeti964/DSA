package Array.LeetCode;
import java.util.*;
//Input: prices = [7,1,5,3,6,4]
//Output: 7
//Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
//Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
//Total profit is 4 + 3 = 7
public class BestSellPrices {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int []arr = new int [n];// 7 1 5 3 6 4
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       int res = bestPrice(arr);
        System.out.println(res);
        System.out.println(maxProfit(arr));
    }
    public static int bestPrice(int []arr){
        int n = arr.length;
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<n;i++){
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]-min);
        }

        return max;

    }
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int max=0,min=Integer.MAX_VALUE;
        int start=0;
        while(start<n){
            min = Math.min(min,prices[start]);
            max = Math.max(max,prices[start]-min);
            start++;
        }
        return max;
    }
}
