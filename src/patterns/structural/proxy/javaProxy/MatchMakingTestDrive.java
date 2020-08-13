package patterns.structural.proxy.javaProxy;

import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {
    PersonBean[] persons;

    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    public MatchMakingTestDrive() {
        initializeDatabase();
    }

    private void initializeDatabase() {
        persons = new PersonBean[]{
            new PersonBeanImpl("lhoussaine", "male", "football", 5),
            new PersonBeanImpl("lahcen", "male", "polytic", 8),
            new PersonBeanImpl("mohammed", "male", "phone games", 9),
            new PersonBeanImpl("brahim", "male", "football", 4)
        };
    }

    public void drive() {
        PersonBean joe = getPersonFromDatabase("lhoussaine");
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        System.out.println("Interests set from owner patterns.structural.proxy");
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Can’t set rating from owner patterns.structural.proxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());
        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("bowling, Go");
        } catch (Exception e) {
            System.out.println("Can’t set interests from non owner patterns.structural.proxy");
        }
        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rating set from non owner patterns.structural.proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }

    private PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
            person.getClass().getClassLoader(),
            person.getClass().getInterfaces(),
            new NonOwnerInvocationHandler(person));
    }

    private PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
            person.getClass().getClassLoader(),
            person.getClass().getInterfaces(),
            new OwnerInvocationHandler(person));
    }

    private PersonBean getPersonFromDatabase(String name) {
        PersonBean result = null;
        for (PersonBean person : persons) {
            if (person.getName().equals(name)) {
                result = person;
                break;
            }
        }
        return result;
    }
}