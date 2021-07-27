package creational.abstractFactory.factory;

import creational.abstractFactory.button.Button;
import creational.abstractFactory.checkbox.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
