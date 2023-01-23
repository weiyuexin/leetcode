package leetcode.problems;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: _1832判断句子是否为全字母句
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/23 23:00
 */
public class _1832判断句子是否为全字母句 {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("uwqohxamknblecdtzpisgvyfjr"));
    }
    public static boolean checkIfPangram(String sentence) {
        if (sentence.length()<26){
            return false;
        }
        int[] zimu = new int[26];
        for (int i=0;i<sentence.length();i++){
            zimu[sentence.charAt(i) - 97]++;
        }
        for (int i=0;i<26;i++){
            if (zimu[i] == 0){
                return false;
            }
        }
        return true;
    }
}
