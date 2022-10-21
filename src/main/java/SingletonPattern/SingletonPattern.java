package SingletonPattern;

public class SingletonPattern {
    private int cnt = 0;
    private static SingletonPattern singletonPattern = new SingletonPattern();

    private SingletonPattern(){};
    public static SingletonPattern getSingletonPattern(){
        return singletonPattern;
    }

    public void print(){
        System.out.println("hello world! "+cnt);
        cnt++;
    }
}
