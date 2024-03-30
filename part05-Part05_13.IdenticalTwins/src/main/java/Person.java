
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

    public boolean equals(Object compared) {

        // if located in same position they are equal
        if (this == compared) {
            return true;
        }
        // return false if not a Person object
        if (!(compared instanceof Person)) {
            return false;
        }
        // if sure it's a person object, make sure the compiler treats it as such
        Person personCompared = (Person) compared;

        // if the values of the object variables are equal, the objects are equal
        if (this.name.equals(personCompared.name) && this.birthday.equals(personCompared.birthday)
                && this.height == personCompared.height && this.weight == personCompared.weight) {
                    return true;
        }

        // otherwise objects are not the same
        return false;

    }
}
