package leetcode.problems;
/*
* @problem https://leetcode.cn/problems/remove-element/
* */
public class RemoveElement27 {
    public static void main(String[] args) {
        int val = 3;
        int[] num = new int[4];
        num[0]=3;
        num[1]=2;
        num[2]=2;
        num[3]=3;
        System.out.println(removeElement(num,val));
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }

    }
    public static int removeElement(int[] nums, int val) {
        int ans = nums.length;
        /*
        * 从头开始遍历数组，遇到和val一样的数，就将这个后的每一个数向前移动一位，同时i减一，ans减一，最后ans的值就是移除val后数组的长度
        * */
        for(int i=ans-1;i>=0;i--){
            if(nums[i]==val){
                ans--;
                for(int j=i;j<nums.length-1;j++){
                    nums[j] = nums[j+1];
                }
                i--;
            }
        }
        return ans;
    }
}
