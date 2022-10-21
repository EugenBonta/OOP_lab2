package inheritance;

public class Main {
    public static void main(String[] args) {

        Bird duck = new Bird(true, true, true);
        System.out.println("\nduck = " + duck);

        System.out.println("\nuse of getter and setter for nrOfLegs:");
        System.out.println("initial value of getter = " + duck.getNrOfLegs());
        duck.setNrOfLegs(1);
        System.out.println("changed value of getter (using setter) = " + duck.getNrOfLegs());
        System.out.println("\"changed\" duck = " + duck);

        Mammal cat = new Mammal(false, 4, "black");
        System.out.println("\ncat = " + cat);

        Reptile snake = new Reptile(0, true);
        System.out.println("\nsnake = " + snake);
    }
}