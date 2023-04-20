package Question2;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.write.metadata.WriteSheet;
import lombok.Data;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
/**
 * @author Haiqing Bai
 * @Date 2023/4/19
 */
////学生类
//@TableName()
@Data
class Student
{
    @StudentAnno(sno="000",name = "Anomy",age = 0)
    @ExcelProperty(value = "学生编号",index = 0)
    private String sno;
    @ExcelProperty(value = "学生姓名",index = 1)
    private String name;
    @ExcelProperty(value = "性别",index = 2)
    private char sex;
    @ExcelProperty(value = "年龄",index = 3)
    private int age;
    @ExcelProperty(value = "家庭住址",index = 4)
    private String address;
    @ExcelProperty(value = "出生日期",index = 5)
    private Date birthday;

    //有参数的构造函数
    public Student(String sno,String address,String name,char sex, String bd) {
        Calendar now = Calendar.getInstance();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date bdd = null;
            bdd = sdf.parse(bd);
            this.birthday=bdd;
        } catch (ParseException e) {
            e.printStackTrace();
        }
//        System.out.println(now.get(Calendar.YEAR));
//        System.out.println(this.birthday.getYear());
        this.age = now.get(Calendar.YEAR) - this.birthday.getYear()-1900;
        this.sno = sno;
        this.address = address;
        this.name = name;
        this.sex = sex;
    }
    public Student()
    {
    }

    String getSno() {
        return sno;
    }

    String getAddress() {
        return address;
    }

    String getName() {
        return name;
    }

    char getSex() {
        return sex;
    }

    Date getBirthday() {
        return birthday;
    }

    int getAge() {
        return age;
    }
}
