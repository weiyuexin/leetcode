package leetcode.problems;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: FindNumbersWithEvenNumberOfDigits1295
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/15 21:20
 */
public class FindNumbersWithEvenNumberOfDigits1295 {
    public static void main(String[] args) {

        int[] nums = new int[5];
        nums[0] = 12;
        nums[1] = 345;
        nums[2] = 2;
        nums[3] = 6;
        nums[4] = 7896;
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int ans = 0;
        for (int i: nums){
            String str = String.valueOf(i);
            if (str.length() % 2 == 0){
                ans ++;
            }
        }
        return ans;
    }
}
