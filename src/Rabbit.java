public class Rabbit extends Animal {
    private String color, name;

    public Rabbit(String name, boolean veg, String food, int legs, String color) {
        super(false, food, legs);
        this.name = name;
        this.vegetarian = isVegetarian();
        this.noOfLegs = legs;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}
