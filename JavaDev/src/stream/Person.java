package stream;

/**
 * Created by bilalsay on 14.12.2016.
 */
public class Person {
    private String name;
    private Integer age;

    Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }


}