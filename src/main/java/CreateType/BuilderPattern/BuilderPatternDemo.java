package CreateType.BuilderPattern;

/**
 * 创建型模式-建造者模式
 * 将多个简单对象一步一步构建成为复杂对象
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {
        Meal meal = new Meal();
        meal.addItems(new VegBurger());
        meal.addItems(new ChickenBurger());
        meal.addItems(new Coke());
        meal.showItems();
        meal.getCost();
    }
}
