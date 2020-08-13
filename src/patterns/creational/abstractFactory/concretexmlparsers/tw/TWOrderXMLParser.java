package patterns.creational.abstractFactory.concretexmlparsers.tw;

import patterns.creational.abstractFactory.XMLParser;

public class TWOrderXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("TW Parsing order XML...");
        return "TW Order XML Message";
    }
}
