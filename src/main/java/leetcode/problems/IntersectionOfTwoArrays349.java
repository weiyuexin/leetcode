package leetcode.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: IntersectionOfTwoArrays
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/14 19:47
 */
public class IntersectionOfTwoArrays349 {
    public static void main(String[] args) {
        int[] nums1 = new int[3];
        int[] nums2 = new int[5];
        nums1[0] = 4;
        nums1[1] = 9;
        nums1[2] = 5;
        nums2[0] = 9;
        nums2[1] = 4;
        nums2[2] = 9;
        nums2[3] = 8;
        nums2[4] = 4;
        System.out.println(intersection(nums1, nums2));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {

        Map<Integer,Integer> map = new HashMap<>();
        if (nums1.length>nums2.length){
            for (int i=0;i<nums1.length;i++){
                map.put(nums1[i],1);
            }
            for (int i=0;i<nums2.length;i++){
                if (map.containsKey(nums2[i])){
                    map.put(nums2[i],map.get(nums2[i])+1);
                }else {
                    map.put(nums2[i],1);
                }
            }
        }else {
            for (int i=0;i<nums2.length;i++){
                map.put(nums2[i],1);
            }
            for (int i=0;i<nums1.length;i++){
                if (map.containsKey(nums1[i])){
                    map.put(nums1[i],map.get(nums1[i])+1);
                }else {
                    map.put(nums1[i],1);
                }
            }
        }

        ArrayList list = new ArrayList();

        if (nums1.length>nums2.length){
            for (int i=0;i<nums1.length;i++){
                if (map.get(nums1[i]) > 1 && !list.contains(nums1[i])){
                    list.add(nums1[i]);
                }
            }
        }else {
            for (int i=0;i<nums2.length;i++){
                if (map.get(nums2[i]) > 1 && !list.contains(nums2[i])){
                    list.add(nums2[i]);
                }
            }
        }
        int[] ans = new int[list.size()];
        for (int i=0;i<list.size();i++){
            ans[i] = (int)list.get(i);
        }

        return ans;
    }
}
