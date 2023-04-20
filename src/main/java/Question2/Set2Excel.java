package Question2;
import com.alibaba.excel.EasyExcel;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author Haiqing Bai
 * @date 2023/4/19
 */
class Set2Excel {
    public static void toExcel(Set<Student> mySet,String filePath){
        List<Student> list1 = new ArrayList<Student>(mySet);
        System.out.println(list1);
//        for(int i = 0; i < list1.size(); i++){
//            System.out.println("list1(" + i + ") --> " + list1.get(i));
//        }
        Class studentClass=Student.class;
        Field[] fields = studentClass.getDeclaredFields();
        for(Field field : fields){
            System.out.println(field.getName());
        }
        EasyExcel.write(filePath, studentClass).sheet("学生表").doWrite(list1);
        System.out.println("ok");
    }
}
