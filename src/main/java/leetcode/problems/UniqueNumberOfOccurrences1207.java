package leetcode.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: UniqueNumberOfOccurrences1207
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/15 21:12
 */
public class UniqueNumberOfOccurrences1207 {
    public static void main(String[] args) {

        int[] arr = new int[6];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 2;
        arr[3] = 1;
        arr[4] = 1;
        arr[5] = 3;
        System.out.println(uniqueOccurrences(arr));
    }
    public static boolean uniqueOccurrences(int[] arr) {

        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> keys = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<arr.length;i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else {
                keys.add(arr[i]);
                map.put(arr[i],1);
            }
        }

        for (Integer key : keys){
            set.add(map.get(key));
        }

        if (set.size() == map.size()){
            return true;
        }
        return false;

    }
}
