import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sizeOfTable;
        printMessage("Please enter a number of elements in the table");
        sizeOfTable = scanner.nextInt();
        int[] numbersFromUser = new int[sizeOfTable];

        printMessage("Please enter " + sizeOfTable + " integers and click enter after each number.");
        for (int counter = 0; counter < sizeOfTable; counter++) {
            numbersFromUser[counter] = scanner.nextInt();
        }
        int maxValue = numbersFromUser[0];
        for (int counter = 0; counter < numbersFromUser.length; counter++) {
            maxValue = getMaxValue(numbersFromUser, maxValue, counter);
        }
        printMessage("The maximum value is: " + (maxValue));

        double sumCounter = 0;
        int TableLength = numbersFromUser.length;
        for (int counter = 0; counter < numbersFromUser.length; counter++) {
            sumCounter = getSumCounter(sumCounter, numbersFromUser[counter]);
        }
        double AverageValue = getAverageValue(sumCounter, TableLength);
        printMessage("The average value is: " + AverageValue);
    }

    private static double getAverageValue(double sumCounter, int TableLength) {
        double AverageValue = sumCounter / TableLength;
        return AverageValue;
    }

    private static double getSumCounter(double sumCounter, int numbersFromUser) {
        sumCounter += numbersFromUser;
        return sumCounter;
    }

    private static int getMaxValue(int[] numbersFromUser, int maxValue, int counter) {
        if (numbersFromUser[counter] > maxValue)
            maxValue = numbersFromUser[counter];
        return maxValue;
    }

    private static void printMessage(String message) {
        System.out.println(message);
    }
}