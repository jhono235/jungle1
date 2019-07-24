class monkey {

    private int monkeyEnergy, numberOfMonkeys;


    public void setNumber(int energy, int numOfAnimals) {

        this.numberOfMonkeys = numOfAnimals;
        this.monkeyEnergy = energy;


    }

    public void getNumberOfAnimals() {
        System.out.println("Number of Monkeys: " + numberOfMonkeys);
    }

    public void getEnergy() {
        System.out.println("Monkey energy: " + monkeyEnergy);
    }


    public void sleep() {
        System.out.println("Monkey is  asleep.");
        this.monkeyEnergy += 10;
        this.getEnergy();
    }


    public void makeSound() {

        if (monkeyEnergy >= 4) {
            System.out.println("Monkey Sound: Oooo Oooo!");

            this.monkeyEnergy -= 4;
            this.getEnergy();


        } else {
            System.out.println("Monkey is too tired.");

        }

        System.out.println();

    }


    public void eatFood() {
        System.out.println("Monkey ate.");
        this.monkeyEnergy += 2;
        this.getEnergy();
    }

    public String play() {
        if (monkeyEnergy >= 8) {

            return "Oooo Oooo Oooo";

        } else
            return "Monkey is too tired";

    }
}
