package patterns.creational.builder;

public class Maiclass {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new ConcretePersonBuilder();
        Person person = personBuilder.setFirstName("lhoussaine")
            .setLastName("ouarhou")
            .setGender("male")
            .setMail("lh.ouarhou@gmail.com")
            .setPhone("0603708829")
            .getPerson();
        System.out.println(person);
    }
}
