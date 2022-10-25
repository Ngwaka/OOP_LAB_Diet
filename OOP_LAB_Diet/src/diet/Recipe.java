package diet;

/**
 * Represent a recipe of the diet.
 * 
 * A recipe consists of a a set of ingredients that are given amounts of raw materials.
 * The overall nutritional values of a recipe can be computed
 * on the basis of the ingredients' values and are expressed per 100g
 * 
 *
 */
public class Recipe implements NutritionalElement {
    
	/**
	 * Recipe constructor.
	 * The reference {@code food} of type {@link Food} must be used to
	 * retrieve the information about ingredients. 
	 * 
	 * @param nome unique name of the recipe
	 * @param food object containing the information about ingredients
	 */
	public Recipe(String name, Food food){
	}
	
	/**
	 * Adds a given quantity of an ingredient to the recipe.
	 * The ingredient is a raw material defined with the {@code food}
	 * argument of the constructor.
	 * 
	 * @param material the name of the raw material to be used as ingredient
	 * @param quantity the amount in grams of the raw material to be used
	 */
	public void addIngredient(String material, double quantity) {
	}

	public String getName() {
		return null;
	}

	public double getCalories() {
		return 0.0;
	}

	public double getProteins() {
		return 0.0;
	}

	public double getCarbs() {
		return 0.0;
	}

	public double getFat() {
		return 0.0;
	}

  public boolean per100g() {
	  // a recipe expressed nutritional values per 100g
    return true;
  }

}
