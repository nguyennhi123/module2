package fruit;

import edible.Edible;

public class Apple extends Fruit implements Edible {
    @Override
    public String howtoEat() {
        return "Apple could be slided";
    }
}
