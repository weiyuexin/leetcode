package leetcode.problems;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: ReverseString344
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/14 20:33
 */
public class ReverseString344 {
    public static void main(String[] args) {
        String str = "Hannah";
        char[] s = str.toCharArray();
        reverseString(s);
    }
    public static void reverseString(char[] s) {
        char temp;
        for (int i=0;i<s.length/2;i++){
            temp = s[i];
            s[i] = s[s.length - i -1];
            s[s.length - i -1] = temp;
        }
        System.out.println(s);
    }
}
