package parser;

import component.classes.ClassObject;
import syntax.Access;
import syntax.AccessType;
import syntax.Identifier;

public class ParserCreateClass {

    public static ClassObject parse(String input) {
        String[] text = input.split(" ");
        int currentIndex = 1;

        // Important parts for later
        Access access = null;
        Identifier id = null;
        ClassObject classObject = null;

        if (text[1].equals("new")) {
            currentIndex = 2;
        }

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

        return classObject;
    }
}
