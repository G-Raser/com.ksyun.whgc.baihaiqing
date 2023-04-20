package Question2;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.annotation.ExcelProperty;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Map;

/**
 * @author Haiqing Bai
 * @date 2023/4/19
 */
class Set2Excel {
    public static void toExcel(Set<Student> mySet,String filePath){
        List<Student> list1 = new ArrayList<Student>(mySet);
        System.out.println(list1);
        Class studentClass=Student.class;
        Field[] fields = studentClass.getDeclaredFields();
        for(Field field : fields){
            System.out.println(field.getName());
        }
        EasyExcel.write(filePath, studentClass).sheet("学生表").doWrite(list1);
        System.out.println("ok");
    }
}
