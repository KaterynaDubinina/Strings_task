package tasks.task01;

public class Task01 {

    public static void main(String[] args) {
        String[] correctedData = correctedData(provideData());
        getOutput(getData(correctedData));
    }

    private static String[] provideData() {
        return new String[]{"brange", "plum", "tomato", "onibn", "grape"};
    }

    private static String[] correctedData(String[] data) {

        for (int i = 0; i < data.length; i++) {
            data[i] = data[i].replaceAll("b", "o");
        }
        return data;
    }

    private static String getData(String[] items) {

        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;

        for (String name : items) {
            count++;
            stringBuilder
                    .append(count)
                    .append(") ")
                    .append(name)
                    .append("\n");
        }

        return stringBuilder.toString();
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
