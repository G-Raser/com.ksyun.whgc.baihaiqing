package Question2;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.lang.reflect.Field;
import java.util.List;
import java.util.ArrayList;
import java.util.Dictionary;
import java.lang.reflect.Method;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.write.metadata.WriteSheet;
/**
 * @author Haiqing Bai
 * @date 2023/4/19
 */
public class PrintInfoDemo {
    public static void main(String[] args) throws Exception {
        String filename = "write.xlsx";
        Class studentClass = Student.class;
        Set<Student> set = new HashSet<Student>();
        set.add(new Student("123","China","张三",'女',"2006-03-19"));
        set.add(new Student("111","China","罗斯",'男',"2006-03-19"));
        Iterator<Student> it = set.iterator();
        while (it.hasNext()) {
            Student myStudent = (Student) it.next();
            System.out.println(myStudent.getName());
        }
//set转list
        List<Student> list1 = new ArrayList<Student>(set);
        for(int i = 0; i < list1.size(); i++){
            System.out.println("list1(" + i + ") --> " + list1.get(i));
        }
        Field[] fields = studentClass.getDeclaredFields();
        for(Field field : fields){
            System.out.println(field.getName());
        }
//        simpleWrite(list1);
    }
//        public static void simpleWrite(List<Student> list1) {
//        String fileName = "D:\\AAA.xlsx";
//        // 这里 需要指定写用哪个class去写，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
//        // 如果这里想使用03 则 传入excelType参数即可
//        EasyExcel.write(fileName, Student.class)
//                .sheet("Test")
//                .doWrite(list1);
//}
}
