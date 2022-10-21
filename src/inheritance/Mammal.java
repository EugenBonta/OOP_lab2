package inheritance;

public class Mammal extends Animal {
    private String color;


    public Mammal(boolean vegetarian, int nrOfLegs, String color) {
        super(vegetarian, nrOfLegs);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "color='" + color + '\'' +
                ", vegetarian=" + vegetarian +
                ", nrOfLegs=" + nrOfLegs +
                '}';
    }
}
