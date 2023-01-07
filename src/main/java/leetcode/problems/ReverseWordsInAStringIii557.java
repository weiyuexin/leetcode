package leetcode.problems;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: ReverseWordsInAStringIii557
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/7 22:18
 * @Problem https://leetcode.cn/problems/reverse-words-in-a-string-iii/
 */
public class ReverseWordsInAStringIii557 {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
    public static String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int i=0;
        int wordLen = 0;
        while (i<chars.length){
            if(chars[i] == ' ' || i == chars.length-1){
                int x=0;
                if(i == chars.length - 1){ //如果处理到最后一个字母，需要往后移动一位,单词长度加一
                    i++;
                    wordLen++;
                }
                for(int j = i-wordLen;j<i-wordLen/2;j++){
                    char temp = chars[j];
                    chars[j] = chars[i-x-1];
                    chars[i-x-1] = temp;
                    x++;
                }
                x = 0;
                wordLen = 0;
            }else {
                wordLen++;
            }
            i++;
        }


        return String.valueOf(chars);
    }
}
