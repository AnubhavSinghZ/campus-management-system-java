package entities;

/*
 * ABSTRACT CLASS (Abstraction)
 * Person is a blueprint - you can never do "new Person()".
 * Only concrete subclasses like Student and Faculty can be
 * instantiated.
 */
public abstract class Person {

    // ENCAPSULATION: private fields, accessed only via getters/setters
    private String name;
    private int age;

    // CONSTRUCTOR (parameterized)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) { // basic validation - another benefit of encapsulation
            this.age = age;
        }
    }

    // Abstract method - every subclass MUST implement this differently.
    // This is where runtime polymorphism (overriding) comes into play.
    public abstract String getRole();

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Role: " + getRole();
    }
}