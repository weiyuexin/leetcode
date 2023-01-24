package leetcode.problems;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: _2114句子中的最多单词数
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/24 22:57
 */
public class _2114句子中的最多单词数 {
    public static void main(String[] args) {
        String[] sentences = new String[3];
        sentences[0] = "alice and bob love leetcode";
        sentences[1] = "i think so too";
        sentences[2] = "this is great thanks very much";
        System.out.println(mostWordsFound(sentences));
    }
    public static int mostWordsFound(String[] sentences) {
        int ans = 0;
        for (String str : sentences){
            int num = 1;
            for (int i=0;i<str.length();i++){
                if (str.charAt(i) == ' ') num++;
            }
            if (ans < num) ans = num;
        }
        return ans;
    }
}
