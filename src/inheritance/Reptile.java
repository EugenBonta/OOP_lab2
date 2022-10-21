package inheritance;

public class Reptile extends Animal {

    private boolean poisonous;
    private String eats;

    public Reptile(int nrOfLegs, boolean poisonous) {
        super(false, nrOfLegs);
        this.poisonous = poisonous;
        eats = "meat";
    }

    public boolean isPoisonous() {
        return poisonous;
    }

    public void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
    }

    @Override
    public String toString() {
        return "Reptile{" +
                "poisonous=" + poisonous +
                ", eats='" + eats + '\'' +
                ", vegetarian=" + vegetarian +
                ", nrOfLegs=" + nrOfLegs +
                '}';
    }
}
