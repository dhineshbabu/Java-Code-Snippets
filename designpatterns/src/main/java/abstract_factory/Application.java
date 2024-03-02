package abstract_factory;

import abstract_factory.uifactory.UIFactory;

public class Application {
    private final Button button;
    private final CheckBox checkbox;

    public Application(UIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

}
