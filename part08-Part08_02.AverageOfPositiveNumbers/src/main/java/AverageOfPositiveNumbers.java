
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double positiveCount = 0;
        
        while (true) {
            double number = Double.valueOf(scanner.nextLine());
            
            if (number > 0) {
                sum += number;
                positiveCount++;
            }
            
            if (number == 0 && positiveCount == 0) {
                System.out.println("Cannot calculate the average");
                break;
            } else if (number == 0) {
                break;
            }
        }
        
        System.out.println(sum / positiveCount);
    }
}
