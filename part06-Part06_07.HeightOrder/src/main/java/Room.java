
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rgd
 */
public class Room {

    private ArrayList<Person> personsInRoom;

    public Room() {
        this.personsInRoom = new ArrayList<Person>();
    }

    public void add(Person person) {
        this.personsInRoom.add(person);
    }

    public boolean isEmpty() {
        return this.personsInRoom.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.personsInRoom;
    }

    public Person take() {
        if (this.personsInRoom.isEmpty()) {
            return null;
        }

        Person removedPerson = this.personsInRoom.get(0);
        Person shortestPerson = shortest();

        for (Person person : this.personsInRoom) {
            if (shortestPerson == person) {
                removedPerson = person;
            }
        }
        this.personsInRoom.remove(removedPerson);

        return removedPerson;
    }

    public Person shortest() {

        if (this.personsInRoom.isEmpty()) {
            return null;
        }

        Person shortestPerson = this.personsInRoom.get(0);
        for (Person person : this.personsInRoom) {
            if (person.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = person;
            }
        }

        return shortestPerson;
    }

}
