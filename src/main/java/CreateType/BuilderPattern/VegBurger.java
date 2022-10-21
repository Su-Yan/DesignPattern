package CreateType.BuilderPattern;

public class VegBurger extends Burg{
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 13.5f;
    }
}
