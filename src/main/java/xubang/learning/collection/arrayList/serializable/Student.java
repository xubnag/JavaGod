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

    @Override
    public String toString() {
        return "I am " +
                 name  +
                ", my age is " + age;
    }
}