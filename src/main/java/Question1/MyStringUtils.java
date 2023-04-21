package Question1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @author Haiqing Bai
 * @date 2023/4/19
 */
public class MyStringUtils {
    /**
     * 首字母变小写
     * @param str
     * @return
     */
    public static String reverseStr(String str) {
        char[] chars = str.toCharArray();
        String reverse = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reverse += chars[i];
        }
        return reverse;
    }
    public static HashMap<Character, Integer> countNum(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            //将此字符串转换为一个新的字符数组。
            //4.使用获取到的字符，去Map集合判断key是否存在
            if (map.containsKey(c)) {
                //key存在
                Integer value = map.get(c);
                value++;
                map.put(c, value);
            } else {
                //key不存在
                map.put(c, 1);
            }
        }
        return map;
    }
    public static void printMost(String str){
        HashMap<Character, Integer> myMap=countNum(str);
        Integer maxValue = 0;
        Character markedChar = '?';
        for (Character key : myMap.keySet()) {
            if(myMap.get(key)>maxValue){
                maxValue=myMap.get(key);
                markedChar=key;
            }
        }
        System.out.println(markedChar+' '+maxValue);
    }

    public static String getLonger(String target) {
        String longerStr = "";
        int maxLonger = 0;
        if(target == null || target.length() == 0) {

            return"illegal";
        }
        // 结束递归
        boolean out = false;
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<target.length();i++) {
            String chat = target.charAt(i) + "";
            if(!sb.toString().contains(chat)) {
                sb.append(chat);
                if(i == target.length() -1) {
                    //整个字符串是否完全遍历
                    longerStr = sb.toString();
                    maxLonger = sb.length();
                    out = true;
                }
            } else {
                if(maxLonger < sb.length() ) {
                    longerStr = sb.toString();
                    maxLonger = sb.length();
                }
                // 每次递归去掉首字母
                target = target.substring(1);
                // 不可能获得更长的子字符串了
                if(maxLonger == target.length()) {
                    out = true;
                }
                break;
            }
        }
        if(!out) {
            getLonger(target);
        }
        return longerStr;
    }
}
