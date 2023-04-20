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

import static Question2.Set2Excel.toExcel;

/**
 * @author Haiqing Bai
 * @date 2023/4/19
 */
public class PrintInfoDemo {
    public static void main(String[] args) throws Exception {
        Class studentClass = Student.class;
        Set<Student> set = new HashSet<Student>();
        set.add(new Student("123","China","张三",'女',"2006-03-19"));
        set.add(new Student("111","China","罗斯",'男',"2006-03-19"));
        Iterator<Student> it = set.iterator();
        while (it.hasNext()) {
            Student myStudent = (Student) it.next();
            System.out.println(myStudent.getName());
        }
        String filePath="C:\\Users\\Administrator\\Desktop\\Test1.xlsx";
        toExcel(set,filePath);
    }
}
