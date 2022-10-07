package xubang.learning.streamAll.stream.java8;

/**
 * 函数式接口中使用泛型
 * @param <T>
 */
@FunctionalInterface
public interface MyPredicate<T> {

	public boolean test(T t);
	
}
