public class MyProgram {
    public static void main(String[] args) {
        // Check if enough arguments are provided
        if (args.length < 4) {
            System.out.println("Usage: java MyProgram <int> <String> <double> <boolean>");
            return;
        }

        // Convert the arguments to appropriate types
        int age = Integer.parseInt(args[0]);
        String name = args[1];
        double score = Double.parseDouble(args[2]);
        boolean isPassed = Boolean.parseBoolean(args[3]);

        // Output the parsed values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Score: " + score);
        System.out.println("Passed: " + isPassed);

        // -------- Odd-Even ----------
        int n=11;
        String[] arr = {"Even", "Odd"};
        System.out.println(arr[n%2]);
    }
}
