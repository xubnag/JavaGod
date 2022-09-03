package xubang.learning.repo;

import java.util.Objects;

/**
 * @author XuBang
 * @version 1.0
 * @date 2022/9/3 15:16
 * @Description 单例模式（线程安全的懒加载） synchronized  解决了安全问题，同时带来了效率问题
 */
public class SingleResponsibilitySafe {
    //1.包含自身类型的成员变量
    private static SingleResponsibilitySafe singleResponsibility;

    //2.构造方法私有
    private SingleResponsibilitySafe() {
    }

    //3.当前类提供静态方法  提供实例
    private synchronized static SingleResponsibilitySafe getInstance() {
        //获得实例的时候，才进行实例化；所以是：懒加载
        if (Objects.isNull(singleResponsibility)) {
            singleResponsibility = new SingleResponsibilitySafe();
        }
        return singleResponsibility;
    }
}