class tiger {

    private int tigerEnergy, numberOfTigers;

    public void setNumber(int energy, int numOfAnimals) {

        this.numberOfTigers = numOfAnimals;
        this.tigerEnergy = energy;


    }

    public void getNumberOfAnimals() {
        System.out.println("Number of Tigers: " + numberOfTigers);
    }

    public void getEnergy() {
        System.out.println("Tiger energy: " + tigerEnergy);
    }


    public void sleep() {
        System.out.println("Tiger is asleep.");
        this.tigerEnergy += 5;
        this.getEnergy();
    }


    public void makeSound() {

        if (tigerEnergy >= 3) {
            System.out.println("Tiger Sound: Roar!");

            this.tigerEnergy -= 3;
            this.getEnergy();
        } else {
            System.out.println("Tiger is too tired.");
        }

        System.out.println();

    }


    public void eatFood() {
        System.out.println("Tiger ate.");
        this.tigerEnergy += 2;
        this.getEnergy();
    }

    public void tigerDo(int number){
        if(number == 1) {
            this.eatFood();
        }
        else if(number == 2){
            this.sleep();
        }
        else
            this.makeSound();




    }


}


