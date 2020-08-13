package patterns.creational.abstractFactory;

public class TestAbstractFactoryPattern {
    public static void main(String[] args) {
        AbstractParserFactory parserFactory = ParserFactoryProducer.getFactory("NYFactory");
        assert parserFactory != null;
        XMLParser parser = parserFactory.getParserInstance("NYORDER");
        String msg = "";
        msg = parser.parse();
        System.out.println(msg);
        System.out.println("************************************");
        parserFactory = ParserFactoryProducer.getFactory("TWFactory");
        assert parserFactory != null;
        parser = parserFactory.getParserInstance("TWFEEDBACK");
        msg = parser.parse();
        System.out.println(msg);
    }
}
