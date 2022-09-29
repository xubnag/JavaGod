package xubang.learning.collection.arrayList.serializable;

import lombok.Data;

import java.io.Serializable;

/**
 * @author XuBang
 * @version 1.0
 * @date 2022/9/29 22:13
 * @Description
 */
@Data
public class Student implements Serializable {
    private String name;
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    //字符串拼接会产生不必要的对象，浪费空间   --->  StringBuilder()
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Student{ name= ");
        builder.append(this.name);
        builder.append(" , age = ");
        builder.append(this.age);
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}