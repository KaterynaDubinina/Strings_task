package tasks.task02;

public class Task02 {
    public static void main(String[] args) {
        String[] correctedData = correctedData(provideData());
        getOutput(getData(correctedData));
    }

    private static String[] provideData() {
        return new String[]{"orange", "plum", "tomato", "onion", "grape", "onion"};
    }

    private static String[] correctedData(String[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i] = data[i].replaceAll("onion", "");
        }
        return data;
    }

    private static String getData(String[] items) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;

        for (String name : items) {
            if (name.length() > 0) {
                count++;
                stringBuilder
                        .append(count)
                        .append(") ")
                        .append(name)
                        .append("\n");
            }
        }
        return stringBuilder.toString();
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
