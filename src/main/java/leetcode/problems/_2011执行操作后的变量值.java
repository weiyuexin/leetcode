package leetcode.problems;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: _2011执行操作后的变量值
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/25 23:20
 */
public class _2011执行操作后的变量值 {
    public static void main(String[] args) {

    }
    public static int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for (String str : operations){
            if (str.charAt(1) == '-') ans--;
            if (str.charAt(1) == '+') ans++;
        }

        return ans;
    }
}
