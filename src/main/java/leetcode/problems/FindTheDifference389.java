package leetcode.problems;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: FindTheDifference389
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/7 22:02
 * @Problem https://leetcode.cn/problems/find-the-difference/
 */
public class FindTheDifference389 {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd","abced"));
    }
    public static char findTheDifference(String s, String t) {
        int[] a = new int[27];
        int[] b = new int[27];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i) - 'a']++;
        }
        for (int i=0;i<t.length();i++){
            b[t.charAt(i) - 'a']++;
        }
        for (int i=0;i<26;i++){
            if(b[i] - a[i] == 1){
                return (char)('a' + i);
            }
        }

        return 'z';
    }
}
