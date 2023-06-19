public class Person {
    private String name;
    private int age;


    public Person() {
    }

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

    public int getAge(int age) {
        return age;
    }

    public void setAge(int age) {
        if (age > 18) {
            this.age = age;
        } else if (age < 18)
            this.age = 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
