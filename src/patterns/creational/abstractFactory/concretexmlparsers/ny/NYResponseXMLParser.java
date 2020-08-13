package patterns.creational.abstractFactory.concretexmlparsers.ny;

import patterns.creational.abstractFactory.XMLParser;

public class NYResponseXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("NY Parsing response XML...");
        return "NY Response XML Message";
    }
}
