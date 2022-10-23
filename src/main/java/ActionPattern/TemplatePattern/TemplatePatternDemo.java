package ActionPattern.TemplatePattern;

/**
 * 行为型模式-模板模式
 * 一个抽象类公开定义了执行它的方法的方式/模板
 * 它的子类可以按照需要重写方法实现，但调用将以抽象类中定义的方式进行
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
