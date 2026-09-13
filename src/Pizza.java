public class Pizza {
    private Dough dough;
    private Sauce sauce;
    private Topping topping;

    protected Pizza() {}

    public void setDough(Dough dough) { this.dough = dough; }
    public void setSauce(Sauce sauce) { this.sauce = sauce; }
    public void setTopping(Topping topping) { this.topping = topping; }

    @Override
    public String toString() {
        return "Pizza [Dough: " + dough + ", Sauce: " + sauce + ", Topping: " + topping + "]";
    }
}