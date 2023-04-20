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
    public static void toExcel(Set<Object> mySet,String filePath){
        List<Object> list1 = new ArrayList<Object>(mySet);
        System.out.println(list1);
        Class studentClass=Student.class;
        Field[] fields = studentClass.getDeclaredFields();
//        List<String> heads=new ArrayList<>();
        for(Field field : fields){
            System.out.println(field.getName());
//            heads.add(field.getName());
        }
//        list1.add(0,heads);
        EasyExcel.write(filePath, studentClass).sheet("学生表").doWrite(list1);
        System.out.println("ok");
    }
}
