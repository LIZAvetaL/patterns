package abstractFactory.cake;

import abstractFactory.Cake;

public class CarrotCake implements Cake {

    @Override
    public void paint() {
        System.out.println("You are cooking carrot cake");
    }
}
