//package Question2;
//import com.alibaba.excel.EasyExcel;
//import java.util.List;
//import java.util.Date;
//import com.alibaba.excel.EasyExcel;
//import com.alibaba.excel.ExcelWriter;
//import com.alibaba.excel.annotation.ExcelIgnore;
//import com.alibaba.excel.annotation.ExcelProperty;
//import com.alibaba.excel.write.metadata.WriteSheet;
//import java.io.File;
//import com.alibaba.easyexcel.test.util.TestFileUtil;
///**
// * @author Haiqing Bai
// * @date 2023/4/19
// */
//public class OutPutSet {
//    public void simpleWrite() {
//        // 注意 simpleWrite在数据量不大的情况下可以使用（5000以内，具体也要看实际情况），数据量大参照 重复多次写入
//
//        // 写法1 JDK8+
//        // since: 3.0.0-beta1
//        String fileName = TestFileUtil.getPath() + "simpleWrite" + System.currentTimeMillis() + ".xlsx";
//        // 这里 需要指定写用哪个class去写，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
//        // 如果这里想使用03 则 传入excelType参数即可
//        EasyExcel.write(fileName, Student.class)
//                .sheet("模板")
//                .doWrite(() -> {
//                    // 分页查询数据
//                    return data();
//                });
//
//}
//    private List<Student> data() {
//        List<Student> list = ListUtils.newArrayList();
//        for (int i = 0; i < 10; i++) {
//            Student data = new Student();
//            data.setString("字符串" + i);
//            data.setDate(new Date());
//            data.setDoubleData(0.56);
//            list.add(data);
//        }
//        return list;
//    }
//}
