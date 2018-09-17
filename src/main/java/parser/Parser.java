package parser;

import component.classes.ClassObject;
import syntax.Access;
import syntax.AccessType;
import syntax.Identifier;

public class Parser {

    public Parser() {

    }

    public void parse(String input) {
        input = input.toLowerCase();
        String[] text = input.split(" ");
        int currentIndex;

        // Important parts for later
        Access access = null;
        Identifier id = null;

        // See if the user wants to create something
        if (text[0].equals("create") && text[1].equals("new")) {
            currentIndex = 2;

            // If access type is available, record it.
            if (AccessType.contains(text[currentIndex])) {
                System.out.println("<access>");
                AccessType accessType = AccessType.getType(text[currentIndex]);
                access = new Access(accessType);
                currentIndex++;
            }

            // Identifier
            id = new Identifier(text[currentIndex]);

            currentIndex++;

            // Component
            // Class
            if (text[currentIndex].equals("class")) {
                System.out.println("<class>");
                ClassObject c = new ClassObject(access, id);
                System.out.println(c);
                currentIndex++;
            }

        }
    }
}
