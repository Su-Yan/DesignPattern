package ActionPattern.NullObjectPattern;

/**
 * 行为型模式-空对象模式
 * 一个空对象取代NULL对象实例的检查，NULL对象不是检查空值，而是反应一个不做任何动作的关系
 * 这样的NULL对象也可以在数据不可用的时候提供默认的行为
 */
public class NullObjectPatternDemo {
    public static void main(String[] args) {

        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}