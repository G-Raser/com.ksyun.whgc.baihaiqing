package Question2;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;


import static Question2.Set2Excel.toExcel;

/**
 * @author Haiqing Bai
 * @date 2023/4/19
 */
public class PrintInfoDemo {
    public static void main(String[] args) throws Exception {
        Set<Student> set = new HashSet<Student>();
        set.add(new Student("123","China","张三","女","2006-03-09"));
        set.add(new Student("111","USA","罗斯","男","2003-01-19"));
        Iterator<Student> it = set.iterator();
        while (it.hasNext()) {
            Student myStudent = (Student) it.next();
            System.out.println(myStudent.getName());
        }
        String filePath="C:\\Users\\Administrator\\Desktop\\Test1.xlsx";
        toExcel(set,filePath);
    }
}
