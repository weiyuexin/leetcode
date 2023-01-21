package leetcode.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: _728自除数
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/21 15:03
 */
public class _728自除数 {
    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1,22));
    }
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i=left;i<=right;i++){
            String str = String.valueOf(i);
            char[] chars = str.toCharArray();
            for (int j =0;j<chars.length;j++){
                if (chars[j] == 48) break;
                if (i % (chars[j] - 48) !=0) break;
                if (j == chars.length -1){
                    list.add(i);
                }
            }
        }
        return list;
    }
}
