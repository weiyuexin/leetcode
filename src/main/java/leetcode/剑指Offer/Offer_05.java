package leetcode.剑指Offer;

/**
 * @PackageName: leetcode.剑指Offer
 * @ProjectName: leetcode
 * @ClassName: Offer_05
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/8 21:39
 * @Problem https://leetcode.cn/problems/ti-huan-kong-ge-lcof/
 */
public class Offer_05 {
    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
    }
    public static String replaceSpace(String s) {
//        char[] chars = s.toCharArray();
//        String ans = "";
//        for (int i=0;i<chars.length;i++){
//            if (chars[i] == ' '){
//                ans += "%20";
//            }else {
//                ans += chars[i];
//            }
//        }
//        return ans;
        /**
         * 最优解法
         */
        char[] chars = new char[s.length()*3];
        int num = 0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i) == ' '){
                chars[num++] = '%';
                chars[num++] = '2';
                chars[num++] = '0';
            }else {
                chars[num++] = s.charAt(i);
            }
        }
        return new String(chars,0,num);
    }
}
