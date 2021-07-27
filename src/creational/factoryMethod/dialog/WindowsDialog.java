package creational.factoryMethod.dialog;

import creational.factoryMethod.button.Button;
import creational.factoryMethod.button.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
