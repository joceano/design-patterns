package creational.factoryMethod.button;

import creational.factoryMethod.button.Button;

/**
 * Windows button implementation.
 */
public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("WindowsButton was rendered");
    }
}
