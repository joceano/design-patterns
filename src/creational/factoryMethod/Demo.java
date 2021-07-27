package creational.factoryMethod;

import creational.factoryMethod.factory.Dialog;
import creational.factoryMethod.factory.HtmlDialog;
import creational.factoryMethod.factory.WindowsDialog;

public class Demo {

    private static Dialog dialog;

    public static void main(String[] args) {
        dialog = new WindowsDialog();
        dialog.renderWindow();

        dialog = new HtmlDialog();
        dialog.renderWindow();
    }
}
