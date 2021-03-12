package cn.onexianyu.learn.args4.sort;

/**
 * @author H
 * @data 2021/3/11.
 */
public class SortTest {

    public static void main(String[] args) {
        Integer[] test = {1,5,2,6,2,84,4,-1,3};
        Person[] people = new Person[5];
        people[0] = new Person("Tom",30);
        people[1] = new Person("Cat",20);
        people[2] = new Person("Bob",10);
        people[3] = new Person("lisy",20);
        people[4] = new Person("Gesby",15);
        //ISort sort = new SelectSort();
        ISort sort = new InsertSort();
        sort.sort(people);
        sort.show(people);

    }
}
