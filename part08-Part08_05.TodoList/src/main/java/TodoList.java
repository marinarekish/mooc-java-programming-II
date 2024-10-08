import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;
    
    public TodoList() {
        this.list = new ArrayList<>();
    }
    
    public void add(String task) {
        this.list.add(task);
    }
    
    public void print() {
        for (int index = 0; index < this.list.size(); index++) {
            System.out.println((index + 1) + ": " + this.list.get(index));
        }
    }
    
    public void remove(int number) {
        int index = number - 1;
        if (index >= 0 && index < this.list.size()) {
            this.list.remove(index);
        }
    }
}