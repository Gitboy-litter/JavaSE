package day14_02.work4;

public class Person {
//    名称(name)和生命值(lifeValue)
    private String name;
    private Integer lifeValue;

    public Person() {
    }

    public Person(String name, Integer lifeValue) {
        this.name = name;
        this.lifeValue = lifeValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(Integer lifeValue) {
        if (lifeValue<0){
            throw new NoLifeValueExption("生命值不能为负数");
        }
        this.lifeValue = lifeValue;
    }
}
