package leetcode.problems;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: 数组元素和与数字和的绝对差2535
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/16 22:01
 */
public class 数组元素和与数字和的绝对差2535 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,15,6,3};
        System.out.println(differenceOfSum(nums));
    }
    public static int differenceOfSum(int[] nums) {
        int ans = 0;
        int sum1 = 0,sum2 = 0;
        for (int i:nums){
            sum1 += i;
        }
        for (int i:nums){
            String str = String.valueOf(i);
            for (int j=0;j<str.length();j++){
                sum2 += (str.charAt(j) - 48);
            }
        }
        return Math.abs(sum1 - sum2);
    }
}
