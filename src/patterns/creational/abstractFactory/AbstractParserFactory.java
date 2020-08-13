package patterns.creational.abstractFactory;

public interface AbstractParserFactory {
    public XMLParser getParserInstance(String parserType);
}