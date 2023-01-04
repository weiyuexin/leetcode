package leetcode.problems;
/*
* @problem https://leetcode.cn/problems/length-of-last-word/
* */
public class LengthOfLastWord58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }

    public static int lengthOfLastWord(String s) {
        int ans =0;
        char[] chars = s.toCharArray();
        /*
        * 从后往前遍历数组，如果ans为0且遍历到空格，则继续遍历，如果ans不为0且遍历到空格，则停止遍历
        * */
        for (int i=chars.length-1;i>=0;i--){
            if(chars[i]!=' '){
                ans++;
            }else if(ans==0){
                continue;
            }else {
                break;
            }
        }
        return ans;
    }
}
