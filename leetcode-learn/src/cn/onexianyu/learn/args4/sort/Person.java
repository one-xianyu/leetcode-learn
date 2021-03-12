package cn.onexianyu.learn.args4.sort;

/**
 * @author H
 * @data 2021/3/11.
 */
public class Person implements Comparable<Person> {

    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return this.age.compareTo(o.getAge()) ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + ":" + this.age;
    }
}
