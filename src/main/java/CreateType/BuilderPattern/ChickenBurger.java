package CreateType.BuilderPattern;

public class ChickenBurger extends Burg{
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 18.6f;
    }
}
