import java.util.ArrayList;

public class TodoList {
    
    private ArrayList<String> todolist;

    public TodoList() {
        this.todolist = new ArrayList<>();
    }

    public void add(String task) {
        todolist.add(task);
    }

    public void print() {
        int index = 1;
        for (String string : todolist) {
            System.out.println( index + ": " + string);
            index++;
        }
    }

    public void remove(int number) {
        this.todolist.remove(number - 1);
    }
}
