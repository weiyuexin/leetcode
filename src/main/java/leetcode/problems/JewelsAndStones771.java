package leetcode.problems;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: JewelsAndStones771
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/8 21:21
 * @Problem https://leetcode.cn/problems/jewels-and-stones/
 */
public class JewelsAndStones771 {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }
    public static int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        for (int i=0;i<stones.length();i++){
            for (int j=0;j<jewels.length();j++){
                if (stones.charAt(i) == jewels.charAt(j)){
                    ans++;
                }
            }
        }
        return ans;
    }
}
