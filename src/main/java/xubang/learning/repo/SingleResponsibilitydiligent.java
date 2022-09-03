package xubang.learning.repo;

import java.util.Objects;

/**
 * @author XuBang
 * @version 1.0
 * @date 2022/9/3 15:29
 * @Description 单例模式（线程安全的立即加载）
 */
public class SingleResponsibilitydiligent {
    //1.包含自身类型的成员变量     //立即加载（类加载的时候（获取实例之前），直接给静态成员变量 实例化）
    private static SingleResponsibilitydiligent singleResponsibilitydiligent = new SingleResponsibilitydiligent();

    //2.构造方法私有
    private SingleResponsibilitydiligent() {
    }

    //3.当前类提供静态方法  提供实例
    private static SingleResponsibilitydiligent getInstance() {
        return singleResponsibilitydiligent;
    }
}