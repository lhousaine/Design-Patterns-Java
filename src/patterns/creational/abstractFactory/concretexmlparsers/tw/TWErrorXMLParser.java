package patterns.creational.abstractFactory.concretexmlparsers.tw;

import patterns.creational.abstractFactory.XMLParser;

public class TWErrorXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("TW Parsing error XML...");
        return "TW Error XML Message";
    }
}
