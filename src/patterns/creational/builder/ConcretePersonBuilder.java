package patterns.creational.builder;

public class ConcretePersonBuilder implements PersonBuilder {
    Person person;

    public ConcretePersonBuilder() {
        this.person = new Person();
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public PersonBuilder setFirstName(String firstName) {
        person.setFirstName(firstName);
        return this;
    }

    @Override
    public PersonBuilder setLastName(String lastName) {
        person.setLastName(lastName);
        return this;
    }

    @Override
    public PersonBuilder setGender(String gender) {
        person.setGender(gender);
        return this;
    }

    @Override
    public PersonBuilder setMail(String mail) {
        person.setMail(mail);
        return this;
    }

    @Override
    public PersonBuilder setPhone(String phone) {
        person.setPhone(phone);
        return this;
    }
}
