package com.trx.pattern.composite.general.safe.safetest;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private String name;
    private List<Component> componentList = null;

    public Composite(String name) {
        super(name);
        this.name = name;
        componentList = new ArrayList<Component>();
    }

    public String operation() {

        StringBuilder stringBuilder = new StringBuilder(this.name);

        for (int i = 0; i < componentList.size(); i++) {

            stringBuilder.append("\n");
            stringBuilder.append(componentList.get(i).operation());
        }
        return stringBuilder.toString();
    }

    public void addChild(Component component) {

        this.componentList.add(component);
    }

    public void remove(int index) {

        this.componentList.remove(index);
    }
}
