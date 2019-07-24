import java.util.Random;
import java.util.Scanner;

public class jungle {

    static tiger t = new tiger();
    static monkey m = new monkey();
    static snakes s = new snakes();


    public void soundOff() {
        t.makeSound();
        m.makeSound();
        s.makeSound();

        t.getNumberOfAnimals();
        m.getNumberOfAnimals();
        s.getNumberOfAnimals();
    }

    public static void main(String args[]) {


        t.setNumber(50, 50);
        m.setNumber(40, 20);
        s.setNumber(35, 60);


        System.out.println("Select a number for an animal or Call out:");
        System.out.println("1. Tiger");
        System.out.println("2. Monkey");
        System.out.println("3.Snake");
        System.out.println("4.Callout");
        System.out.println("5.Exit");


        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Tiger Selected. How many?");


                int numOfTigers = scanner.nextInt();

                System.out.println("How much energy?");


                int energyOfTigers = scanner.nextInt();

                t.setNumber(energyOfTigers, numOfTigers);


                System.out.println("What would you like the them to do?");

                System.out.println();

                System.out.println("1. Eat");
                System.out.println("2. Sleep");
                System.out.println("3.Make a sound");

                System.out.println();

                int tigerAction = scanner.nextInt();

                switch (tigerAction) {
                    case 1:
                        t.eatFood();
                        break;

                    case 2:
                        t.sleep();
                        break;

                    case 3:
                        t.makeSound();
                        break;


                }


                break;
            case 2:

                System.out.println("Monkey Selected. How many?");


                int numOfMonkeys = scanner.nextInt();

                System.out.println("How much energy?");


                int energyOfMonkeys = scanner.nextInt();

                m.setNumber(energyOfMonkeys, numOfMonkeys);


                System.out.println("What would you like the them to do?");

                System.out.println();

                System.out.println("1. Eat");
                System.out.println("2. Sleep");
                System.out.println("3.Make a sound");

                System.out.println();

                int monkeyAction = scanner.nextInt();

                switch (monkeyAction) {
                    case 1:
                        m.eatFood();
                        break;

                    case 2:
                        m.sleep();
                        break;

                    case 3:
                        m.makeSound();
                        break;
                }

                break;

            case 3:
                System.out.println("Snake Selected. How many?");


                int numOfSnakes = scanner.nextInt();

                System.out.println("How much energy?");


                int energyOfSnakes = scanner.nextInt();

                s.setNumber(energyOfSnakes, numOfSnakes);


                System.out.println("What would you like the them to do?");

                System.out.println();

                System.out.println("1. Eat");
                System.out.println("2. Sleep");
                System.out.println("3.Make a sound");

                System.out.println();

                int snakeAction = scanner.nextInt();

                switch (snakeAction) {
                    case 1:
                        s.eatFood();
                        break;

                    case 2:
                        s.sleep();
                        break;

                    case 3:
                        s.makeSound();
                        break;
                }
                break;
            case 4:
                jungle one = new jungle();
                one.soundOff();
                break;

            case 5:
                break;
            default:
                System.out.println("Invalid input,please try again.");
        }


    }


}

