package ActionPattern.VisitorPattern;

/**
 * 行为型模式-访问者模式
 * 我们使用了一个访问者类，，它改变了元素类的执行方法。通过这种方式，元素的执行算法可以
 * 随着访问者改变而改变
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
