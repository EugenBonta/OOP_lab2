package inheritance;

public class Animal {
    protected boolean vegetarian;
    protected int nrOfLegs;


    public Animal(boolean vegetarian, int nrOfLegs) {
        this.vegetarian = vegetarian;
        this.nrOfLegs = nrOfLegs;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public int getNrOfLegs() {
        return nrOfLegs;
    }

    public void setNrOfLegs(int nrOfLegs) {
        this.nrOfLegs = nrOfLegs;
    }

    @Override
    public String toString() {
        return "inheritance.Animal{" +
                "vegetarian=" + vegetarian +
                ", nrOfLegs=" + nrOfLegs +
                '}';
    }
}


