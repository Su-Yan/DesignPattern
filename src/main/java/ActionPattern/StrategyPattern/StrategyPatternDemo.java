package ActionPattern.StrategyPattern;

/**
 * 行为型模式-策略模式
 * 一个类的行为或其算法可以在运行时更改
 * 在策略模式中，我们创建表示各种策略的对象和一个行为随着策略对象改变而改变的context对象
 * 策略对象改变context对象的执行算法
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
