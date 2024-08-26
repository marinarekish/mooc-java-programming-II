
import java.util.Scanner;

public class UserInterface {
    
    private TodoList list;
    private final Scanner scan;
    
    public UserInterface(TodoList list, Scanner scan){
        this.list = list;
        this.scan = scan;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            
            String command = scan.nextLine();
            
            switch(command) {
                case "add":
                    System.out.print("To add: ");
                    String task = scan.nextLine();
                    
                    list.add(task);
                    break;
                    
                case "list":
                    list.print();
                    break;
                    
                case "remove":
                    System.out.print("Which one is removed? ");
                    int index = Integer.valueOf(scan.nextLine());
                    
                    list.remove(index);
                    
                    break;
                    
                case "stop":
                    return;
                
                default:
                    break;
            }
        }
    }
}
