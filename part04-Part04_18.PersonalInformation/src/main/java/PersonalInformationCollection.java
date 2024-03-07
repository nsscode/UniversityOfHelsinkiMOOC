
import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.MidiDevice.Info;

public class PersonalInformationCollection {

    public static void main(String[] args) {

        // Create collection to store PersonalInformation objects
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        // Keep promting user for information until they enter an empty first name
        while (true) {
            // Ask user for their first name
            System.out.print("First name: ");
            String firstName = scanner.nextLine();

            // If first name is empty, break out of the loop
            if (firstName.isEmpty()) {
                break;
            }

            // Ask user for their last name
            System.out.print("Last name: ");
            String lastName = scanner.nextLine();

            // Ask user for their identification number
            System.out.print("Identification number: ");
            String identificationNumber = scanner.nextLine();

            // Create a new PersonalInformation object and add it to the collection
            infoCollection.add(new PersonalInformation(firstName, lastName, identificationNumber));
        }

        System.out.println(" ");
        // Print out first and last name of each person in the collection
        for (PersonalInformation person : infoCollection) {
            System.out.println(person.getFirstName() + " " + person.getLastName());

        }
    }
}
