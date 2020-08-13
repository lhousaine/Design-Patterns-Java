package patterns.creational.abstractFactory.concretefactories;

import patterns.creational.abstractFactory.AbstractParserFactory;
import patterns.creational.abstractFactory.XMLParser;
import patterns.creational.abstractFactory.concretexmlparsers.tw.TWErrorXMLParser;
import patterns.creational.abstractFactory.concretexmlparsers.tw.TWFeedbackXMLParser;
import patterns.creational.abstractFactory.concretexmlparsers.tw.TWOrderXMLParser;
import patterns.creational.abstractFactory.concretexmlparsers.tw.TWResponseXMLParser;

public class TWParserFactory implements AbstractParserFactory {
    @Override
    public XMLParser getParserInstance(String parserType) {
        switch (parserType) {
            case "TWERROR":
                return new TWErrorXMLParser();
            case "TWFEEDBACK":
                return new TWFeedbackXMLParser();
            case "TWORDER":
                return new TWOrderXMLParser();
            case "TWRESPONSE":
                return new TWResponseXMLParser();
        }
        return null;
    }
}
