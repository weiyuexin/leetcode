package leetcode.problems;

import java.util.*;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: GroupAnagrams49
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/15 20:29
 */
public class GroupAnagrams49 {
    public static void main(String[] args) {
        String[] strs = new String[6];
        strs[0] = "eat";
        strs[1] = "tea";
        strs[2] = "tan";
        strs[3] = "ate";
        strs[4] = "nat";
        strs[5] = "bat";
        System.out.println(groupAnagrams(strs));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        ArrayList<String> keys = new ArrayList<>();

        for (int i=0;i<strs.length;i++){
            char[] chars = strs[i].toCharArray();
            // 对字符数组进行排序，再转换成字符串，将这个字符串作为map中的key，这样可以保证不重复
            Arrays.sort(chars);
            String temp = String.valueOf(chars);
            if (map.containsKey(temp)){
                List<String> list = map.get(temp);
                list.add(strs[i]);
                map.put(temp,list);
            }else {
                keys.add(temp);
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(temp,list);
            }
        }

        for (String key : keys){
            ans.add(map.get(key));
        }

        return ans;
    }
}
