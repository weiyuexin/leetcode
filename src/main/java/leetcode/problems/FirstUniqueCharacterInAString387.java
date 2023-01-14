package leetcode.problems;

import java.util.ArrayList;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: FirstUniqueCharacterInAString387
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/14 20:19
 */
public class FirstUniqueCharacterInAString387 {
    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(firstUniqChar(s));
    }
    public static int firstUniqChar(String s) {

        int ans = -1;
        int[] nums = new int[27];
        for (int i=0;i<s.length();i++){
            nums[s.charAt(i) - 97]++;
        }
        for (int i=0;i<s.length();i++){
            if (nums[s.charAt(i) - 97] ==1){
                ans = i;
                break;
            }
        }

        return ans;
    }
}
