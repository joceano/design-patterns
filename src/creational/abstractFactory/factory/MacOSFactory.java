package creational.abstractFactory.factory;

import creational.abstractFactory.button.Button;
import creational.abstractFactory.button.MacOSButton;
import creational.abstractFactory.checkbox.Checkbox;
import creational.abstractFactory.checkbox.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
