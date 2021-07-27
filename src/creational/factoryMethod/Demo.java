package creational.factoryMethod;

import creational.factoryMethod.dialog.Dialog;
import creational.factoryMethod.dialog.HtmlDialog;
import creational.factoryMethod.dialog.WindowsDialog;

public class Demo {

    private static Dialog dialog;

    public static void main(String[] args) {
        dialog = new WindowsDialog();
        dialog.renderWindow();

        dialog = new HtmlDialog();
        dialog.renderWindow();
    }
}
