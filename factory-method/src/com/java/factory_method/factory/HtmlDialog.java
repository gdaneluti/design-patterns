package com.java.factory_method.factory;

import com.java.factory_method.buttons.Button;
import com.java.factory_method.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
