import java.lang.System.Logger;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.XMLFormatter;

// Дополнительно. К калькулятору из предыдущего дз добавить логирование.
// 1 + 3 = 4

public class Task_14 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Task_12.class.getName());
        FileHandler fh = new FileHandler("log_Task_14.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Действие: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите действие: ");
        String[] input = sc.nextLine().split(" ");
        sc.close();
        switch (input[1]) {
            case "+" -> System.out.println(Float.parseFloat(input[0]) + Float.parseFloat(input[2]));
            case "-" -> System.out.println(Float.parseFloat(input[0]) - Float.parseFloat(input[2]));
            case "*" -> System.out.println(Float.parseFloat(input[0]) * Float.parseFloat(input[2]));
            case "/" -> {
                if ((Float.parseFloat(input[2])) != 0) System.out.println("На ноль делить нельзя");
                else System.out.println(Float.parseFloat(input[0]) / Float.parseFloat(input[2]));
            }
            default -> {
            }
        }
    }
}


