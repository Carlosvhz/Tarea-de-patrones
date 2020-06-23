public interface MealBuilder {

    public abstract void addSandwich(String sandwich);
    public abstract void addSides(String order);
    public abstract void addDrink(String drink);
    public abstract void addOffer(String offer);
    public abstract void setPrice(double price);
    public abstract Meal getMeal();

}