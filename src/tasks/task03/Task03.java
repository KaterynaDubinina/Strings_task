package tasks.task03;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        String searchName = inputData();
        int count = searchData(provideData(), searchName);
        getOutput(getData(count, searchName));
    }

    private static String[] provideData() {
        return new String[]{"Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa"};
    }

    private static String inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name: ");
        return scanner.nextLine();
    }

    private static int searchData(String[] data, String searchName) {

        int count = 0;
        for (String name : data) {
            if (name.equals(searchName)) {
                count++;
            }
        }
        return count;
    }

    private static String getData(int count, String searchName) {

        if (count > 0) {
            return "Listed: " + count + " " + searchName + "(s)!";
        } else {
            return "There is no such name.";
        }
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
