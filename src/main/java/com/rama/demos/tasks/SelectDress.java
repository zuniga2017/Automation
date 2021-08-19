package com.rama.demos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static com.rama.demos.userinterface.YourLogoSelectDress.*;

public class SelectDress implements Task {




    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(DRESSES),
                Click.on(SUMMER_DRESSES),
        MoveMouse.to(DRESS),
                Click.on(BTN_QUICK_VIEW)

                );
    }
}
