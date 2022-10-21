package CreateType.PrototypePattern;

/**
 * 创建型模式-原型模式
 * 快速提供对象拷贝
 */

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape:"+clonedShape.getType());
        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape:"+clonedShape2.getType());
        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape:"+clonedShape3.getType());

    }
}
