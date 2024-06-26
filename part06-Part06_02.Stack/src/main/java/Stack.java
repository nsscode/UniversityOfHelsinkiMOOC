import java.util.ArrayList;

public class Stack {

    private ArrayList<String> list;

    public Stack() {
        this.list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public void add(String value) {
        this.list.add(value);
    }

    public ArrayList<String> values() {
        return list;
    }

    public String take() {
        return this.list.remove(this.list.size() - 1);


        // if (!list.isEmpty()) {
        //     String lastElement = list.get(list.size() - 1); 
        //     list.remove(list.size() - 1);
        //     return lastElement;
        // } else {
        //     return null; 
        // }
    }
}