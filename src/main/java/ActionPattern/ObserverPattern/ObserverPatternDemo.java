package ActionPattern.ObserverPattern;

/**
 * 行为型模式-观察者模式
 * 当一个对象被修改时，则会自动通知依赖它的对象
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
