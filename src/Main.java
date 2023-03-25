import java.io.*;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        int temp;

        Random RandomNumber = new Random();
        int[] NumbersToSort = new int[10];

        PrintWriter myWriter = new PrintWriter("text.txt");

        for (int a = 0; a < NumbersToSort.length; a++) {
            NumbersToSort[a] = RandomNumber.nextInt(100);
            myWriter.println(String.valueOf(NumbersToSort[a]));
        }
        myWriter.close();


        for (int i = 0; i < NumbersToSort.length - 1; i++) {
            if (NumbersToSort[i] > NumbersToSort[i + 1]) {
                temp = NumbersToSort[i];
                NumbersToSort[i] = NumbersToSort[i + 1];
                NumbersToSort[i + 1] = temp;
            }

            for (int j = 0; j < NumbersToSort.length - i - 1; j++) {

                if (NumbersToSort[j] > NumbersToSort[j + 1]) {
                    temp = NumbersToSort[j];
                    NumbersToSort[j] = NumbersToSort[j + 1];
                    NumbersToSort[j + 1] = temp;
                }
            }
        }

        Scanner odczyt = new Scanner(new File("text.txt"));

        while (odczyt.hasNext()) {
            String zdanie = odczyt.nextLine();
            System.out.println(zdanie);
        }

        for (int NumberToSort : NumbersToSort)
            System.out.println(NumberToSort);

    }
}
