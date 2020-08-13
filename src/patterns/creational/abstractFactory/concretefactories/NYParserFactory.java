package patterns.creational.abstractFactory.concretefactories;

import patterns.creational.abstractFactory.AbstractParserFactory;
import patterns.creational.abstractFactory.XMLParser;
import patterns.creational.abstractFactory.concretexmlparsers.ny.NYErrorXMLParser;
import patterns.creational.abstractFactory.concretexmlparsers.ny.NYFeedbackXMLParser;
import patterns.creational.abstractFactory.concretexmlparsers.ny.NYOxrderXMLParser;
import patterns.creational.abstractFactory.concretexmlparsers.ny.NYResponseXMLParser;

public class NYParserFactory implements AbstractParserFactory {
    @Override
    public XMLParser getParserInstance(String parserType) {
        switch (parserType) {
            case "NYERROR":
                return new NYErrorXMLParser();
            case "NYFEEDBACK":
                return new NYFeedbackXMLParser();
            case "NYORDER":
                return new NYOxrderXMLParser();
            case "NYRESPONSE":
                return new NYResponseXMLParser();
        }
        return null;
    }
}