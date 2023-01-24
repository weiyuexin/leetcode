package leetcode.problems;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: _1672最富有客户的资产总量
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/24 22:49
 */
public class _1672最富有客户的资产总量 {
    public static void main(String[] args) {
        int[][] accounts = new int[3][2];
        accounts[0][0] = 1;
        accounts[0][1] = 5;
        accounts[1][0] = 7;
        accounts[1][1] = 3;
        accounts[2][0] = 3;
        accounts[2][1] = 5;
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int ans = 0;
        for (int i=0;i<accounts.length;i++){
            int sum = 0;
            for (int j=0;j<accounts[i].length;j++){
                sum += accounts[i][j];
            }
            if (ans < sum) ans = sum;
        }

        return ans;
    }
}
