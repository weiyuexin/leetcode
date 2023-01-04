package leetcode.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wyx
 * @problem https://leetcode.cn/problems/roman-to-integer/
 */
public class RomanToInteger13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String s) {
        int ans = 0;
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        char[] chars = s.toCharArray();
        for (int i=chars.length-1;i>=0;i--){
            if(chars[i]=='V' && i>0 &&  chars[i-1]=='I'){
                ans+=4;
                i--;
            }else if(chars[i]=='X' && i>0 &&  chars[i-1]=='I'){
                ans+=9;
                i--;
            } else if(chars[i]=='L' && i>0 &&  chars[i-1]=='X'){
                ans+=40;
                i--;
            }else if(chars[i]=='C' && i>0 &&  chars[i-1]=='X'){
                ans+=90;
                i--;
            }else if(chars[i]=='D' && i>0 &&  chars[i-1]=='C'){
                ans+=400;
                i--;
            }else if(chars[i]=='M' && i>0 &&  chars[i-1]=='C'){
                ans+=900;
                i--;
            }else {
                ans+=map.get(chars[i]);
            }
        }

        return ans;
    }
}
