package Question1;
import java.util.Map;
import java.util.Scanner;

import static Question1.MyStringUtils.*;
/**
 * @author Haiqing Bai
 * @date 2023/4/20
 */
public class StringUtilsDemo {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个字符串：");
//        String str = sc.next();
        String str= "abcdafgc";
        String str1=reverseStr(str);
        System.out.println("原字符串："+str);
        System.out.println("反转测试结果："+str1);
        Map<Character,Integer> mapResult=countNum(str);
        //展示结果map
        System.out.println("字母出现次数统计map展示：");
        for (Character key : mapResult.keySet()) {
            Integer value = mapResult.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("出现次数最多字母展示：");
        printMost(str);
        System.out.println("最长非重复字母子串展示：");
        System.out.println(getLonger(str));
    }
}
