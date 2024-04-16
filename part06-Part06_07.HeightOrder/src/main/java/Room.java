import java.util.ArrayList;

public class Room {
    private ArrayList<Person> personList;

    public Room() {
        this.personList = new ArrayList<>();
    }

    public void add(Person person) {
        personList.add(person);
    }

    public boolean isEmpty() {
        return this.personList.isEmpty();
    }

    public ArrayList<Person> getPersons() {

        if (personList.isEmpty()) {
            return null;
        }

        return personList;
    }

    public Person shortest() {
        if (this.personList.isEmpty()) {
            return null;
        }

        Person returnObject = this.personList.get(0);

        for (Person person : personList) {
            if (returnObject.getHeight() > person.getHeight()) {
                returnObject = person;
            }
        }

        return returnObject;
    }

    public Person take() {
        // Check if room is empty
        if (this.personList.isEmpty()) {
            return null;
        }

        // Initialize the shortest person with the first person on the list
        Person shortestPerson = this.personList.get(0);

        // Initialize index of the shortest person
        int indexShortestPerson = 0;

        // Iterate through the list to find the shortest person
        for (int i = 0; i < this.personList.size(); i++) {
            // Person object to compare the shortest person with
            Person currentPerson = this.personList.get(i);

            // Compare the height of the current person with the shortest person
            if (currentPerson.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = currentPerson;
                indexShortestPerson = i; // Keep track of the index of the shortest person
            }
        }

        return this.personList.remove(indexShortestPerson);

    }
}
