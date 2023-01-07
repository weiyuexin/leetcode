package leetcode.problems;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: RansomNote383
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/7 21:51
 * @Problem https://leetcode.cn/problems/ransom-note/
 */
public class RansomNote383 {
    public static void main(String[] args) {
        boolean b = canConstruct("aa", "ab");
        System.out.println(b);
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        boolean ans = true;
        char[] ransomNoteChar = ransomNote.toCharArray();
        char[] magazineChar = magazine.toCharArray();

        int[] a = new int[27];
        int[] b = new int[27];
        for (int i=0;i<ransomNoteChar.length;i++){
            a[(int)ransomNoteChar[i] - 97]++;
        }
        for (int i=0;i<magazineChar.length;i++){
            b[(int)magazineChar[i] - 97]++;
        }
        for(int i=0;i<27;i++){
            if(a[i] > b[i]){
                return false;
            }
        }


        return ans;
    }
}
