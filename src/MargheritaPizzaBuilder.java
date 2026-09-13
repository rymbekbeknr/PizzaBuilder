public class MargheritaPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public MargheritaPizzaBuilder() { this.pizza = new Pizza(); }

    @Override
    public PizzaBuilder buildDough() { pizza.setDough(Dough.THIN); return this; }
    @Override
    public PizzaBuilder buildSauce() { pizza.setSauce(Sauce.TOMATO); return this; }
    @Override
    public PizzaBuilder buildTopping() { pizza.setTopping(Topping.BASIL); return this; }

    @Override
    public Pizza build() {
        if (pizza == null) throw new IllegalStateException("Pizza is not initialized!");
        return this.pizza;
    }
}