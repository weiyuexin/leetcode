package leetcode.problems;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: SortArrayByParity905
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/15 21:04
 */
public class SortArrayByParity905 {
    public static void main(String[] args) {
        int[] nums = new int[4];
        nums[0] = 3;
        nums[1] = 1;
        nums[2] = 2;
        nums[3] = 4;
        System.out.println(sortArrayByParity(nums));
    }
    public static int[] sortArrayByParity(int[] nums) {
        for (int i=0;i<nums.length;i++){
            if (nums[i]%2 == 0){
                for (int j = i;j>0;j--){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
        /*for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }*/

        return nums;
    }
}
