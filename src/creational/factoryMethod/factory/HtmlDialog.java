package creational.factoryMethod.factory;

import creational.factoryMethod.button.Button;
import creational.factoryMethod.button.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
