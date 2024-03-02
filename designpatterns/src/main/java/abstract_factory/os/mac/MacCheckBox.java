package abstract_factory.os.mac;

import abstract_factory.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Mac Checkbox");
    }
}
