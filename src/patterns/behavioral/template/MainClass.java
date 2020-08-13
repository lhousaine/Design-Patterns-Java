package patterns.behavioral.template;

public class MainClass {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        System.out.println("\nMaking tea...");
        tea.prepareRecipe();
        System.out.println("\nMakying coffee...");
        coffee.prepareRecipe();
    }
}
