package com.java.factory_method.factory;

import com.java.factory_method.buttons.Button;
import com.java.factory_method.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
