package com.trx.pattern.decorator.general.generaltest;

public class Decorator extends Component {


    private Component  component;
    public Decorator(Component  component) {

        this.component = component;
    }

    public void add() {
        component.add();
    }
}
