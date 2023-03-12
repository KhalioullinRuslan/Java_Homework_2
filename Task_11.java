import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.


public class Task_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Задайте длину массива: ");
        int size = input.nextInt(); 
        int array[] = new int[size]; 
        System.out.println("Введите элементы массива: ");
        input.close();
        
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); 
        }
        System.out.print ("Введённые элементы массива: ");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]); 
        }
        System.out.println();
        System.out.println("Пузырьковая сортировка: " + bubble(array));
        System.out.println();
    }

    public static String bubble(int[] mas) {
        boolean isSorted = false;
        int buf;
        String file_name = "Java_Homework_2/log_Task_11.txt";
        File file = new File(file_name);
        try{
            FileWriter writer = new FileWriter(file,false);
            while(!isSorted) {
                isSorted = true;
                for (int i = 0; i < mas.length-1; i++) {
                    if(mas[i] > mas[i+1]){
                        isSorted = false;
    
                        buf = mas[i];
                        mas[i] = mas[i+1];
                        mas[i+1] = buf;
                        writer.write(Arrays.toString(mas));
                        writer.write("\n");
                    }
                    
                }
            }
            writer.close();
    } catch (Exception e){ 
        System.out.println("Что то пошло не так");
    }
        return Arrays.toString(mas);
    }
}    
    