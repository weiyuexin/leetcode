package leetcode.problems;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: _1281整数的各位积和之差
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/23 23:17
 */
public class _1281整数的各位积和之差 {
    public static void main(String[] args) {
        System.out.println((int) '0');
    }
    public static int subtractProductAndSum(int n) {
        int ans = 0;
        String str = String.valueOf(n);
        char[] chars = str.toCharArray();
        int num1=1,num2=0;
        for(int i=0;i<chars.length;i++){
            num1 *= (chars[i] - 48);
            num2 += (chars[i] - 48);
        }

        return num1 - num2;
    }
}
