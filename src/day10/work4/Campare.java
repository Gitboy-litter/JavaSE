package day10.work4;

public class Campare implements CompareAble {
    @Override
    public Apple compare(Apple a,Apple b) {
        return a=a.getSize()>b.getSize()?a:b;
    }
}
