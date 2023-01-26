package leetcode.problems;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: _35搜索插入位置
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/26 19:29
 */
public class _35搜索插入位置 {
    /* 二分查找
    二分查找需要传入一个数组（升序）和需要在数组中查找的对应的值，
    首先对数组的首尾进行标记left,end，获取数组首尾的标记获取中间
    的数据middle，中间的数据与查找的进行对比，如果中间的数据等于查
    询的数据，直接返回下标，如果查询的数据大于中间的数据，需要将middle+1
    赋值给left,如果查询的数据小于中间的数据，则需要将middle-1赋值给end，
    重复操作，直到找到这个值。
    * */
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(nums,target));
    }
    public static int searchInsert(int[] nums, int target) {
        int ans = 0;
        int left = 0;
        int right = nums.length;
        while (left<right){
            int middle = left + (right - left) / 2;
            if (nums[middle] == target){
                return middle;
            }
            if (nums[middle] > target){
                right = middle;
            }
            if (nums[middle] < target){
                left = middle + 1;
            }
        }

        return right;
    }
}
