
public class HealthStation {

    private int weighingsCount;

    public int weigh(Person person) {
        this.weighingsCount++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return this.weighingsCount;
    }

}
