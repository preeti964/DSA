package Array.LeetCode;

public class moveZeros {
    public static void main(String[] args) {
        int arr []= {0,1,0,3,12};
        moveZeroes(arr);
        for(int ele:arr){
            System.out.print(ele + " ");
        }

        }
     static void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;

        while (j < nums.length) {
            if (nums[j] != 0) {
                nums[i++] = nums[j];
            }
            j++;
        }

        while (i < nums.length) {
            nums[i++] = 0;
        }
    }
}
