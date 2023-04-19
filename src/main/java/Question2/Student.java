package Question2;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
/**
 * @author Haiqing Bai
 * @Date 2023/4/19
 */
//学生类
class Student
{
    @AnnotionBase(sno="000",name = "Anomy",age = 0)
    private String sno;
    private String address;
    private String name;
    private int age;
    private char sex;
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
    String getSno()
    {
        return sno;
    }
    String getAddress()
    {
        return address;
    }
    String getName()
    {
        return name;
    }
    char getSex()
    {
        return sex;
    }
    Date getBirthday()
    {
        return birthday;
    }
    int getAge()
    {
        return age;
    }
@Override
public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", sno='" + sno + '\'' +
            ", address='" + address + '\'' +
            ", sex='" + sex + '\'' +
            ", birthday='" + birthday + '\'' +
            '}';
}
    void print()
    {
        System.out.println("学生信息：" + '\n');
        System.out.println("       " + "学号" + "                   " + "地址" + "          " + "姓名" + "    " + "性别" + "   " + "出生日期" + '\n');
        System.out.println(this.sno + "   " + this.address + "     " + this.name + "    " + this.sex + "   " + this.birthday + '\n');
    }
}
