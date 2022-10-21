package inheritance;

public class Bird extends Animal {
    private boolean canFly;
    private boolean canSwim;

    public Bird(boolean vegetarian, boolean canFly, boolean canSwim) {
        super(vegetarian, 2);
        this.canFly = canFly;
        this.canSwim = canSwim;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "canFly=" + canFly +
                ", canSwim=" + canSwim +
                ", vegetarian=" + vegetarian +
                ", nrOfLegs=" + nrOfLegs +
                '}';
    }
}
