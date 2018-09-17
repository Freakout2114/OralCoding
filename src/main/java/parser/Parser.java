package parser;

public class Parser {

    public Parser() {

    }

    public void parse(String input) {
        input = input.toLowerCase();

        // See if the user wants to create something
        if (input.contains("create")) {
            ParserCreateClass.parse(input);
        }
    }
}
