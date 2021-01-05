package abstractFactory.cake;

import abstractFactory.Cake;

public class ChocolateCake implements Cake {

    @Override
    public void paint() {
        System.out.println("You are cooking chocolate cake");
    }
}
