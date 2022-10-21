package CreateType.FactoryPattern;

/**
 * 创建型模式-工厂模式
 * 我们在创建实体类时对客户端隐藏创建逻辑，用一个通用的接口来指向创建的对象
 */

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();
        Shape square = shapeFactory.getShape("square");
        square.draw();
    }
}
