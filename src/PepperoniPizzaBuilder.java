public class PepperoniPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public PepperoniPizzaBuilder() { this.pizza = new Pizza(); }

    @Override
    public PizzaBuilder buildDough() { pizza.setDough(Dough.THICK); return this; }
    @Override
    public PizzaBuilder buildSauce() { pizza.setSauce(Sauce.BBQ); return this; }
    @Override
    public PizzaBuilder buildTopping() { pizza.setTopping(Topping.PEPPERONI); return this; }

    @Override
    public Pizza build() {
        if (pizza == null) throw new IllegalStateException("Pizza is not initialized!");
        return this.pizza;
    }
}