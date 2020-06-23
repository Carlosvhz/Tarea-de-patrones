 class SandwichMealBuilder implements MealBuilder{

    private Meal meal = new Meal();

	@Override
	public void addSandwich(String sandwich) {
		meal.sandwich = sandwich;
	}

	@Override
	public void addSides(String order) {
		meal.sideOrder = order;
	}

	@Override
	public void addDrink(String drink) {
		meal.drink = drink;
	}

	@Override
	public void addOffer(String offer) {
		meal.offer = offer;
	}

	@Override
	public void setPrice(double price) {
		meal.price = price;
	}

	@Override
	public Meal getMeal() {
		return meal;
	}
    
}