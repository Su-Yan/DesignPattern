package AbstractFactoryPattern;

public class AbstractFactoryProducer {
    public static AbstractFactory getAbstractFactory(String choice){
        if (choice.equalsIgnoreCase("shape")){
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        return null;
    }
}
