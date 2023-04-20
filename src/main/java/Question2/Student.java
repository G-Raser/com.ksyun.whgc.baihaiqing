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
@Data
class Student
{
    @StudentAnno(sno="000",name = "Anomy",age = 0)
//    @ExcelProperty(value = "学号",index = 0)
    @ExcelProperty(index = 0)
    private String sno;
//    @ExcelProperty(value = "{姓名",index = 1)
    @ExcelProperty(index = 1)
    private String name;
//    @ExcelProperty(value = "性别",index = 2)
    @ExcelProperty(index = 2)
    private String sex;
//    @ExcelProperty(value = "年龄",index = 3)
    @ExcelProperty(index = 3)
    private int age;
//    @ExcelProperty(value = "地址",index = 4)
    @ExcelProperty(index = 4)
    private String address;
//    @ExcelProperty(value = "生日",index = 5)
    @ExcelProperty(index = 5)
    private Date birthday;
    public String getSno() {
        return sno;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public Date getBirthday() {
        return birthday;
    }
    public void setSno(String sno) {
        this.sno = sno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public Student()
    {
    }
    public Student(String sno,String address,String name,String sex, String bd) {
        Calendar now = Calendar.getInstance();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date bdd = null;
            bdd = sdf.parse(bd);
            this.birthday=bdd;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.age = now.get(Calendar.YEAR) - this.birthday.getYear()-1900;
        this.sno = sno;
        this.address = address;
        this.name = name;
        this.sex = sex;
    }
}
