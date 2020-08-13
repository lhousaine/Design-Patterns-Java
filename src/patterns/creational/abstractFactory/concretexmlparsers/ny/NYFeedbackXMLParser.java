package patterns.creational.abstractFactory.concretexmlparsers.ny;

import patterns.creational.abstractFactory.XMLParser;

public class NYFeedbackXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("NY Parsing feedback XML...");
        return "NY Feedback XML Message";
    }
}
