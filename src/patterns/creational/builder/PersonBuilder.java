package patterns.creational.builder;

public interface PersonBuilder {
    public Person getPerson();

    public PersonBuilder setFirstName(String firstName);

    public PersonBuilder setLastName(String lastName);

    public PersonBuilder setGender(String gender);

    public PersonBuilder setMail(String mail);

    public PersonBuilder setPhone(String phone);
}
