package StructureType.BridgePattern;

/**
 * 结构型模式-桥接模式
 * 把抽象化和现实化解耦，使得二者可以独立变化
 */

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100,10,new RedAPI());
        Shape greenCircle = new Circle(100,100,10,new GreenAPI());

        redCircle.draw();
        greenCircle.draw();
    }
}
