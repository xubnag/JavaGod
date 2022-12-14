package xubang.learning.repo;

import java.util.Objects;

/**
 * @author XuBang
 * @version 1.0
 * @date 2022/9/3 09:43
 * @Description 单例模式（线程不安全的懒加载）
 */
public class SingleResponsibility {
    //1.包含自身类型的成员变量
    private static SingleResponsibility singleResponsibility;

    //2.构造方法私有
    private SingleResponsibility() {
    }

    //3.当前类提供静态方法  提供实例
    private static SingleResponsibility getInstance() {
        //获得实例的时候，才进行实例化；所以是：懒加载
        if (Objects.isNull(singleResponsibility)) {
            singleResponsibility = new SingleResponsibility();
        }
        return singleResponsibility;
    }
}