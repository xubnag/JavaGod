package xubang.learning.collection.arrayList.serializable;

import java.io.*;

/**
 * @author XuBang
 * @version 1.0
 * @date 2022/9/29 22:13
 * @Description 序列化学习
 */
public class SerializableLearning {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeObject();
        readObject();
    }

    /**
     * 序列化-写对象：将对象的数据写入到文件中
     */
    private static void writeObject() throws IOException {
        //创建对象操作流  --> 序列化：将数据写入到文件中
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/xubang/IdeaProjects/JavaGod/src/main/java/xubang/learning/collection/arrayList/serializable/data.txt"));
        //创建学生对象
        Student xubang = new Student("xubang", 18);
        //将对象内容写入文件
        oos.writeObject(xubang);
        oos.close();
    }

    /**
     * 反序列化-读对象：将文件中对象的数据读取出来
     */
    private static void readObject() throws IOException, ClassNotFoundException {
        //创建对象操作流  --> 反序列化：将数据从文件中读取到对象中
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/xubang/IdeaProjects/JavaGod/src/main/java/xubang/learning/collection/arrayList/serializable/data.txt"));
        //调用方法读取数据
        Student stu = (Student) ois.readObject();
        System.out.println(stu);
    }


}