package leetcode.problems;

import java.util.HashMap;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: _70爬楼梯
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/30 22:35
 */
public class _70爬楼梯 {
    public static void main(String[] args) {

    }
    // 动态规划
    // 思路：将问题拆解成若干个小问题，通用公式为: f(n) = f(n-1) + f(n-2)
    // 使用HashMap充当备忘录
    static HashMap<Integer,Integer> map = new HashMap<>();
    public static int climbStairs(int n) {
        if (n == 0){
            return 1;
        }
        if (n <= 2){
            return n;
        }

        // 先判断有没有计算过当前值
        if (map.containsKey(n)){
            //如果计算过，直接返回map中存放的值
            return map.get(n);
        }else {
            // 没有计算过，则将计算结果存入map
            map.put(n,climbStairs(n - 1) + climbStairs(n - 2));
            return map.get(n);
        }
    }
}
