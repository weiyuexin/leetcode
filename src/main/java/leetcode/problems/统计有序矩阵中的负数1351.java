package leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: 统计有序矩阵中的负数1351
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/15 21:27
 */
public class 统计有序矩阵中的负数1351 {
    public static void main(String[] args) {
        int[][] grid = new int[4][4];
        grid[0][0] = 4;
        grid[0][1] = 3;
        grid[0][2] = 2;
        grid[0][3] = -1;

        grid[1][0] = 3;
        grid[1][1] = 2;
        grid[1][2] = 1;
        grid[1][3] = -1;

        grid[2][0] = 1;
        grid[2][1] = 1;
        grid[2][2] = -1;
        grid[2][3] = -2;

        grid[3][0] = -1;
        grid[3][1] = -1;
        grid[3][2] = -2;
        grid[3][3] = -3;

        System.out.println(countNegatives(grid));
    }
    public static int countNegatives(int[][] grid) {
        int ans = 0;
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[i].length;j++){
                if (grid[i][j] < 0){
                    ans++;
                }
            }
        }

        return ans;
    }
}
