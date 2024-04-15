
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {

        String toPrint = "The collection " + this.name;

        // Check if the list is empty
        if (this.elements.isEmpty()) {
            return toPrint + " is empty.";
        }

        // Return different print statement if there's only one element in the list
        if (this.elements.size() == 1) {
            return toPrint + " has 1 element:\n" + this.elements.get(0);
        }

        // Create string that can save the elements in the list
        String elementsInList = "";

        // Add each element in the list to the string
        for (String element : elements) {
            elementsInList = elementsInList + element + "\n";
        }

        return toPrint + " has " + this.elements.size() + " elements:\n" + elementsInList;
    }
}
