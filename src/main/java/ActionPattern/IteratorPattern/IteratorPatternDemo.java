package ActionPattern.IteratorPattern;

/**
 * 行为型模式-迭代器模式
 * 用于顺序访问集合对象的元素，不需要知道集合对象的底层表示
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
