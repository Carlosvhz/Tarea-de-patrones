class MealDirector {
    
    public void makeMeal(MealBuilder mealBuilder) {	
		mealBuilder.addSandwich("Subway");
		mealBuilder.addSides("Papas");
		mealBuilder.addDrink("Agua");
		mealBuilder.addOffer("Especial de la semana");
		mealBuilder.setPrice(80);
   }

}