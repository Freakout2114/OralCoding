import parser.Parser;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        String inputText = "Create new private test class";
        Parser parser = new Parser();

        System.out.println("Input text: " + inputText);
        parser.parse(inputText);
    }
}
