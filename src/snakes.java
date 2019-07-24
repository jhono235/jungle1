class snakes {

    private int snakeEnergy, numberOfSnakes;
    String snake = "Snake";

    public void setNumber(int energy, int numOfAnimals) {

        this.numberOfSnakes = numOfAnimals;
        this.snakeEnergy = energy;


    }

    public void getNumberOfAnimals() {
        System.out.println("Number of Snakes: " + numberOfSnakes);
    }

    public void getEnergy() {
        System.out.println("Snake energy: " + snakeEnergy);
    }


    public void sleep() {
        System.out.println("Snake is asleep.");
        this.snakeEnergy += 10;
        this.getEnergy();
    }


    public void makeSound() {

        if (snakeEnergy >= 3) {
            System.out.println("Snake Sound: SSS!");
            this.snakeEnergy -= 3;
            this.getEnergy();
        } else {
            System.out.println("Snake is too tired.");
        }

        System.out.println();

    }


    public void eatFood() {
        System.out.println("Snake aat.");
        this.snakeEnergy += 5;
        this.getEnergy();
    }


}

