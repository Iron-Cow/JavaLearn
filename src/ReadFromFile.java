import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "src/test.txt"; // input your file path here (relative)
        File file = new File(path);


        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();


        String numbersPath = "./src/numbers.txt"; // ./ means current folder (root) ////   ../ means parent folder
        file = new File(numbersPath);
        scanner = new Scanner(file);

        String line = scanner.nextLine();
        System.out.println(line); // 1 2 3
        String[] numbers = line.split(" ");
        int[] intNumbers = new int[numbers.length];
        int counter = 0;
        for(String number: numbers){
            intNumbers[counter] = Integer.parseInt(number);
            counter++;
        }
        System.out.println(Arrays.toString(numbers)); // [1, 2, 3]
        System.out.println(Arrays.toString(intNumbers)); // [1, 2, 3]
        scanner.close();


    }
}
