package patterns.creational.abstractFactory.concretexmlparsers.tw;

import patterns.creational.abstractFactory.XMLParser;

public class TWFeedbackXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("TW Parsing feedback XML...");
        return "TW Feedback XML Message";
    }
}
