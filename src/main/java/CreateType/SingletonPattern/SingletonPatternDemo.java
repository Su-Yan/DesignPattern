package CreateType.SingletonPattern;

/**
 * 创建型模式-单例模式
 * 仅创建一个对象
 */

public class SingletonPatternDemo {

    public void print1(){
        SingletonPattern singletonPattern = SingletonPattern.getSingletonPattern();
        singletonPattern.print();
    }

    public void print2(){
        SingletonPattern singletonPattern = SingletonPattern.getSingletonPattern();
        singletonPattern.print();
    }

    public static void main(String[] args) {
        SingletonPatternDemo singletonPatternDemo = new SingletonPatternDemo();
        singletonPatternDemo.print1();
        singletonPatternDemo.print2();
    }
}
