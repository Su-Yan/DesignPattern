package ActionPattern.MediatorPattern;

/**
 * 行为型模式-中介者模式
 * 用来降低多个对象和类之间的通信复杂性，提供了一个中介类，该类通常处理不同类之间
 * 的通信，并支持松耦合，是代码易于维护
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
