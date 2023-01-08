package leetcode.problems;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: ToLowerCase709
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/8 21:15
 * @Problem https://leetcode.cn/problems/to-lower-case/
 */
public class ToLowerCase709 {
    public static void main(String[] args) {
        System.out.println(toLowerCase("LOVELY"));
    }
    public static String toLowerCase(String s) {
        char[] chars = s.toCharArray();
        for (int i=0;i<s.length();i++){
            if (chars[i] >= 'A' && chars[i] <= 'Z'){
                chars[i] += 32;
            }
        }
        return String.valueOf(chars);
    }
}
