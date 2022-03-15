package accessment_PREP.bigDinner;

public class Dinner {
    private String appetizer,drink,side,meal,dessert;


    public Dinner(String appetizer, String drink, String side, String meal, String dessert) {
        this.appetizer = appetizer;
        this.drink = drink;
        this.side = side;
        this.meal = meal;
        this.dessert = dessert;
    }

    public String getAppetizer() {
        return appetizer;
    }

    public void setAppetizer(String appetizer) {
        this.appetizer = appetizer;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }


}
