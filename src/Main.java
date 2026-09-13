public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        System.out.println("Building Margherita...");
        PizzaBuilder margheritaBuilder = new MargheritaPizzaBuilder();
        Pizza margherita = waiter.constructPizza(margheritaBuilder);
        System.out.println(margherita);

        System.out.println("\nBuilding Pepperoni...");
        PizzaBuilder pepperoniBuilder = new PepperoniPizzaBuilder();
        Pizza pepperoni = waiter.constructPizza(pepperoniBuilder);
        System.out.println(pepperoni);
    }
}