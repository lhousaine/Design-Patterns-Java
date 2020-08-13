package patterns.creational.abstractFactory.concretexmlparsers.ny;

import patterns.creational.abstractFactory.XMLParser;

public class NYOxrderXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("NY Parsing order XML...");
        return "NY Order XML Message";
    }
}
