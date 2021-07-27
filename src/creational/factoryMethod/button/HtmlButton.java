package creational.factoryMethod.button;

import creational.factoryMethod.button.Button;

/**
 * HTML button implementation.
 */
public class HtmlButton implements Button {

    @Override
    public void render() {
        System.out.println("HtmlButton was rendered");
    }
}
