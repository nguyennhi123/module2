package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String howtoEat(){
        return "eat";
    }
    @Override
    public String makeSound() {
        return "chit";
    }
}

