package leetcode.剑指Offer;

/**
 * @PackageName: leetcode.剑指Offer
 * @ProjectName: leetcode
 * @ClassName: Offer_64
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/23 22:21
 */
public class Offer_64 {
    public static void main(String[] args) {
        System.out.println(sumNums(3));
    }
    public static int sumNums(int n) {

        boolean flag = n > 0 && (n += sumNums(n - 1)) > 0;
        return n;
    }
}
