import java.util.ArrayList;

public class Bird {
    private String name;
    private String latinName;
    private int count;//

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.count = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getCount() {
        return count;
    }

    public void observe() {
        this.count++;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.getCount() + " observations";

    }

}
