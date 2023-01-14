package leetcode.problems;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: MoveZeroes283
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/14 20:40
 */
public class MoveZeroes283 {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 0;
        nums[3] = 3;
        nums[4] = 12;
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        for (int i=0;i<n;){
            if (nums[i] == 0){
                for (int j =i;j<n-1;j++){
                    nums[j] = nums[j+1];
                }
                n--;
            }
            if (nums[i] != 0){
                i++;
            }
        }
       // System.out.println(n);
        for (int i=0;i<nums.length;i++){
            if (i>=n){
                nums[i] = 0;
            }
            //System.out.print(nums[i]+" ");
        }

    }
}
