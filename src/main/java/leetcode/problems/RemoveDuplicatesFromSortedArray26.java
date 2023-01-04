package leetcode.problems;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/*
*@problem https://leetcode.cn/problems/remove-duplicates-from-sorted-array/
*
* */
public class RemoveDuplicatesFromSortedArray26 {
    public static void main(String[] args) {
        int[] num = new int[7];
        num[0]=-3;
        num[1]=-1;
        num[2]=0;
        num[3]=0;
        num[4]=0;
        num[5]=3;
        num[6]=3;
//        num[7]=3;
//        num[8]=3;
//        num[9]=4;
        System.out.println(removeDuplicates(num));
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    public static int removeDuplicates(int[] nums) {
        /*
        * 解法二： 双指针
        首先注意数组是有序的，那么重复的元素一定会相邻。求删除重复元素，实际上就是将不重复的元素移到数组的左侧。
        考虑用 2 个指针，一个在前记作 p，一个在后记作 q，算法流程如下：1.比较 p 和 q 位置的元素是否相等。
        如果相等，q 后移 1 位 如果不相等，将 q 位置的元素复制到 p+1 位置上，p 后移一位，q 后移 1 位
        重复上述过程，直到 q 等于数组长度。返回 p + 1，即为新数组长度。
        * */
        int p=0,q=1;
        while (q<nums.length){
            if(nums[p] != nums[q]){
                nums[p+1]=nums[q];
                p++;
            }
            q++;
        }
        return p+1;

        /*
        解法一：暴力
        int ans =nums.length;
        for (int i=0;i<ans;i++){
            for(int j=i+1;j<ans;j++){
                if(nums[i] == nums[j]){
                    for(int k=j;k<ans-1;k++){
                        nums[k] = nums[k+1];
                    }
                    ans--;j--;
                }
            }
        }
        return ans;
        */
    }
}
