public class Waiter {
    public Pizza constructPizza(PizzaBuilder builder) {
        return builder.buildDough()
                .buildSauce()
                .buildTopping()
                .build();
    }
}