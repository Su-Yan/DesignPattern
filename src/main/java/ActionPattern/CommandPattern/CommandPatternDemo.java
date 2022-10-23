package ActionPattern.CommandPattern;

/**
 * 行为型模式-命令模式
 * 一种数据驱动的设计模式，请求以命令的形式包裹在对象中，并传给调用对象
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrder();
    }
}
