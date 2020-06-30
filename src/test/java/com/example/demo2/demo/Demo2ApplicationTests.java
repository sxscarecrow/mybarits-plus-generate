package com.example.demo2.demo;

import com.hifive.player.broadcasts.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest
class Demo2ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void h(){
        /**
         * 增强的for循环
         * int numners[] = {10,11,12,13};
         *
         * for (int n : numners ){
         *      System.out.println(n + ",");
         *     }
         */

        /**
         * 条件语句
         *  Integer number = 80;
         *         if (number.equals(80)){
         *             System.out.println("加油");
         *         }
         *
         *         int mm = 90;
         *         if (mm == 90){
         *             System.out.println("你一定行的");
         *         }
         */

        /**
         * Math的用法
         * System.out.println(Math.max(1.2,1.3));
         */

        /**
         * valueOf 不太懂
         * Integer number = Integer.valueOf(12);
         *         Integer mm = Integer.hashCode(10);
         *
         *         String str = "10";
         *         System.out.println(str.hashCode());
         */

        /**
         * Character对象 针对单个字符操作
         *
         *  Character str = new Character('1');
         *         System.out.println(str.getClass());
         */

        /**
         * 创建格式化字符串
         *  Float floatVar = 1.2f;
         *         Integer integer = 1;
         *         String s = "123456";
         *
         *         // 这里的 + 换行连接符
         *         System.out.printf("浮点型变量的值为 " +
         *                 "%f, 整型变量的值为 " +
         *                 " %d, 字符串变量的值为 " +
         *                 "is %s", floatVar, integer, s);
         */

        /**
         * String.indexOf() 返回字符出现的位置
         *  String s = "abc";
         *         System.out.println(s.indexOf("c"));
         */

        /**
         * 当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类
         * StringBuilder 的方法不是线程安全的（不能同步访问）。
         * StringBuilder stringBuilder = new StringBuilder("hello:");
         *         stringBuilder.append("加油");
         *         stringBuilder.append("孩子");
         *
         *         System.out.println(stringBuilder);
         *
         *         String s = "123";
         *         s = "145";
         *         // 输出145
         *         System.out.println(s);
         */

        /**
         * 创建数组 并获取最大的值
         *
         * double[] doubles = {1.8,1.3,1.4};
         *         double max = doubles[0];
         *         for (int i = 1; i < doubles.length; i++){
         *             if (doubles[i] > max){
         *                 max = doubles[i];
         *             }
         *         }
         *         System.out.println(max);
         */

        /**
         *  读取从控制台输入的字符
         *         char c;
         *         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
         *         System.out.println("输入字符，按下 'q' 键退出");
         *
         *         //读取字符
         *         try {
         *             do{
         *                 c = (char) bufferedReader.read();
         *                 System.out.println(c);
         *
         *             }while (c != 'q');
         *
         *         } catch (IOException e) {
         *             e.printStackTrace();
         *         }
          */

        Student student1 = new Student(22, "李四", "男");
        Student student2 = new Student(23,"李五", "男");
        Student student3 = new Student(23,"李六", "女");
        Student student4 = new Student(25,"李七", "男");
        Student student5 = new Student(24,"李七", "男");

        List<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        // filter 操作
        //List<Student> studentList = students.stream().filter(s -> "李五" .equals(s.getName())).collect(Collectors.toList());

        // map 操作
        List<String> stringList = students.stream().map(s->"姓名:".concat(s.getName())).collect(Collectors.toList());

        // distinct 去重
        Long count = students.stream().distinct().count();

        // sorted 排序 按年齡升序來排
//        students.stream().sorted((s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()))
//                .forEach(System.out::println);

        // limit 限制返回結果的个数
        students.stream().limit(2).forEach(System.out::println);

        System.out.println(count);

    }

    @Test
    public void test(){
        String str = "20190701-20190731";

        LocalDate dt = LocalDate.parse(str.split("-")[0],
                DateTimeFormatter.ofPattern("yyyyMMdd")).withDayOfMonth(1);


        System.out.println(dt);
    }

    @Test
    public void test1(){
        Stream.of("apple","banana","orange","waltermaleon","grape")
                .map(e->e.length()) //转成单词的长度 int
                .forEach(e->System.out.println(e)); //输出
    }

}
