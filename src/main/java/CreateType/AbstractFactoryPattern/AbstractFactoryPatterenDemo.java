package CreateType.AbstractFactoryPattern;


/**
 * 创建型模式-抽象工厂模式
 * 围绕一个超级工厂创建其他工厂
 * 工厂的工厂
 */
public class AbstractFactoryPatterenDemo {
    public static void main(String[] args) {
        Shape shape = AbstractFactoryProducer.getAbstractFactory("shape").getShape("circle");
        shape.draw();
        Color red = AbstractFactoryProducer.getAbstractFactory("color").getColor("red");
        red.fill();

    }
}
