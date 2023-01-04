package leetcode.problems;
/*
* @problem https://leetcode.cn/problems/plus-one/
* */
public class PlusOne66 {
    public static void main(String[] args) {
        int[] digits = new int[4];
        digits[0]=4;
        digits[1]=9;
        digits[2]=9;
        digits[3]=9;
        plusOne(digits);
        for(int i=0;i<digits.length;i++){
            System.out.print(digits[i]+" ");
        }
    }
    public static int[] plusOne(int[] digits) {
        //从后往前，每一位依次加一，结果对10取余，结果不为0则返回数组
        for(int i=digits.length-1;i>=0;i--){
            digits[i] = ++digits[i]%10;
            if(digits[i]!=0) {
                return digits;
            }
        }
        /*
        所有位都需要加一操作，例如99，999，9999等，单独处理
        * */
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }
}
