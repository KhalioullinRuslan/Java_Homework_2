import java.util.Scanner;

// Напишите метод, который принимает на вход строку (String) 
// и определяет является ли строка палиндромом (возвращает boolean значение). 
// Без встр. функций

package Java_Homework_2;

public class Task_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Введите строку: ");
        String str = scanner.nextLine(); 
        scanner.close();

        char[] array = str.toCharArray();
        

        int count = 0;
        boolean Boolean = true;

        for (int i = 0; i < array.length / 2; i++) {
            if(array[i] == array[array.length - 1 - i])
                count++;
            }

        if(count == array.length / 2) {
            System.out.println(Boolean);
        } else {
            System.out.println(!Boolean);
        }
    }
}
    

