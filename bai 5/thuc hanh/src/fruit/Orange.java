package fruit;

import edible.Edible;

public class Orange extends Fruit implements Edible {
    @Override
    public String howtoEat(){
        return "Orange could be juiced";
    }

}
