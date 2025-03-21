package core;

/**
 *
 * @author jcami
 */
public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Person(" + id  + ", name=" + name + ')';
    }
    
}
