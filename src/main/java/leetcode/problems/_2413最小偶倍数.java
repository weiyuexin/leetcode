package leetcode.problems;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: _2413最小偶倍数
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/23 22:00
 */
public class _2413最小偶倍数 {
    public static void main(String[] args) {
        System.out.println(smallestEvenMultiple(10));
    }
    public static int smallestEvenMultiple(int n) {
        int ans = 0;
        if (n % 2 == 0){
            ans = n;
        }else {
            ans = n * 2;
        }

        return ans;
    }
}
