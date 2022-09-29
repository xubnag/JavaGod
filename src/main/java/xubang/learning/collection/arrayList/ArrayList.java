package xubang.learning.collection.arrayList;

import java.util.Arrays;
import java.util.List;

/**
 * @author XuBang
 * @version 1.0
 * @date 2022/9/29 21:04
 * @Description ArrayList 练习
 */
public class ArrayList {
    public static void main(String[] args) {
        //1.8版本的一个bug     11版本该bug解决了   （向面试官证明自己看过源码的一个栗子）
        bugView();

        
    }

    /**
     *  1.8版本的一个bug     11版本该bug解决了   （向面试官证明自己看过源码的一个栗子）
     */
    private static void bugView() {
        Integer[] array ={1,2,3};
        List<Integer> integers = Arrays.asList(array);
        Object[] objects = integers.toArray();
        System.out.println(objects.getClass()==Object[].class);      //false

        List<Integer> list = new java.util.ArrayList<>();
        System.out.println(list.toArray().getClass() == Object[].class);      //true
    }
}