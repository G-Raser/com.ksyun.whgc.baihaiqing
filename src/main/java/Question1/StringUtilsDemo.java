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
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        // 查找并返回来自此扫描器的下一个完整标记
        String str1=reverseStr(str);
        System.out.println(str1);
        Map<Character,Integer> mapResult=countNum(str);
        for (Character key : mapResult.keySet()) {
            Integer value = mapResult.get(key);
            System.out.println(key + "=" + value);
        }
        printMost(str);
        System.out.println(getLonger(str));
    }
}
