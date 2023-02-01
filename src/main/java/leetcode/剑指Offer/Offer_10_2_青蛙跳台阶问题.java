package leetcode.剑指Offer;

import java.util.HashMap;

/**
 * @PackageName: leetcode.剑指Offer
 * @ProjectName: leetcode
 * @ClassName: Offer_10_2_青蛙跳台阶问题
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/1 22:05
 */
public class Offer_10_2_青蛙跳台阶问题 {
    public static void main(String[] args) {

    }
    static HashMap<Integer,Integer> map = new HashMap<>();
    public static int numWays(int n) {
        // 动态规划
        // 思路：将问题拆解成若干个小问题，通用公式为: f(n) = f(n-1) + f(n-2)
        // 使用HashMap充当备忘录
        if (n == 0){
            return 1;
        }
        if (n <=2 ){
            return n;
        }
        if (map.containsKey(n)){
            return map.get(n);
        }else {
            map.put(n,(numWays(n - 1) + numWays(n - 2))%1000000007);
            return map.get(n);
        }
    }
}
