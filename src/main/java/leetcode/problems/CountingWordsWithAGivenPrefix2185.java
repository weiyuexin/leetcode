package leetcode.problems;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: CountingWordsWithAGivenPrefix2185
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/8 19:59
 * @Problem https://leetcode.cn/problems/counting-words-with-a-given-prefix/
 */
public class CountingWordsWithAGivenPrefix2185 {
    public static void main(String[] args) {
        String[] words = new String[4];
        words[0] = "pay";
        words[1] = "attention";
        words[2] = "practice";
        words[3] = "attend";
        String pref = "at";
        System.out.println(prefixCount(words,pref));
    }
    public static int prefixCount(String[] words, String pref) {
        /*int ans = 0;
        char[] prefChars = pref.toCharArray();
        for (int i = 0; i< words.length; i++){
            char[] c = words[i].toString().toCharArray();
            System.out.println(c);
            int j = 0;
            while (c.length>j && prefChars.length > j && c[j] == prefChars[j]){
                if(j == prefChars.length - 1){
                    ans++;
                }
                j++;
            }
        }
        return ans;*/
        /**
         * 最优解
         * 使用String类的startWith方法
         */
        int ans = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                ans ++;
            }
        }
        return ans;
    }
}
