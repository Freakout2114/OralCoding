import parser.Parser;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        String inputText;
        Parser parser = new Parser();

        inputText = "Create person class";
        System.out.println("Input text: " + inputText);
        parser.parse(inputText);

    }
}
