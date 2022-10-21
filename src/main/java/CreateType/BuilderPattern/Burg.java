package CreateType.BuilderPattern;

public abstract class Burg implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

}
