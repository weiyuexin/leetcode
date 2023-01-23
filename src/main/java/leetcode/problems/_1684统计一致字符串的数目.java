package leetcode.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: _1684统计一致字符串的数目
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/23 22:46
 */
public class _1684统计一致字符串的数目 {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = new String[5];
        words[0] = "ad";
        words[1] = "bd";
        words[2] = "aaab";
        words[3] = "baa";
        words[4] = "badab";
        System.out.println(countConsistentStrings(allowed,words));
    }
    public static int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;
        Set<Character> set = new HashSet<>();
        for (int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }
        for (int i=0;i<words.length;i++){
            Set<Character> set1 = new HashSet<>(set);
            for (int j=0;j<words[i].length();j++){
                set1.add(words[i].charAt(j));
            }
            if (set1.size() == set.size()){
                ans++;
            }
        }
        return ans;
    }
}
