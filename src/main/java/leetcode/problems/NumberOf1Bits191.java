package leetcode.problems;

/**
 * @author wyx
 * @problem https://leetcode.cn/problems/number-of-1-bits/
 */
public class NumberOf1Bits191 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(111111111));
    }
    public static int hammingWeight(int n) {
        int ans =0;
        for(int i=0;i<32;i++){
            if((n & (1 << i))!=0){
                ans++;
            }
        }
        return ans;
    }
}
