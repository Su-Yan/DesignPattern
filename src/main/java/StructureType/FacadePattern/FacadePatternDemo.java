package StructureType.FacadePattern;

/**
 * 结构型模式-外观模式
 * 隐藏系统的复杂性。并向客户端提供了一个客户端可以访问系统的接口
 * 向现有的系统添加了一个接口，用来隐藏系统的复杂性
 */
public class FacadePatternDemo {
    public static void main(String[] args) {

        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
