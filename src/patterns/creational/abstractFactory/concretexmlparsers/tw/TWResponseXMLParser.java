package patterns.creational.abstractFactory.concretexmlparsers.tw;

import patterns.creational.abstractFactory.XMLParser;

public class TWResponseXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("TW Parsing response XML...");
        return "TW Response XML Message";
    }
}
