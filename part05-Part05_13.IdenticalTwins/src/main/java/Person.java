
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public SimpleDate getBirthday() {
        return this.birthday;
    }

    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public boolean sameBirthday(Person compared) {
        return (this.birthday.equals(compared.getBirthday()));
    }

    public boolean sameName(Person compared) {
        return (this.name.equals(compared.getName()));
    }

    public boolean sameHeight(Person compared) {
        return (this.height == compared.getHeight());
    }

    public boolean sameWeight(Person compared) {
        return (this.weight == compared.getWeight());
    }

    public boolean samePerson(Person compared) {
        if (this.sameName(compared) && this.sameBirthday(compared) && this.sameWeight(compared) && this.sameHeight(compared)) {
            return true;
        }
        return false;
    }

    // implement an equals method here for checking the equality of objects
    @Override
    public boolean equals(Object compared) {

        Person comparedPerson = (Person) compared;
        if (this.samePerson(comparedPerson)) {
            return true;
        }
        return false;
    }
}
