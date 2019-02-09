package mystore.acciones;

import mystore.ui.LasPaginaFalabella;



import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class PaginaFalabella implements Task {

    public static Performable bancol (){
        return instrumented(PaginaFalabella.class);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(LasPaginaFalabella.BOTON_PRIMERO),
                Click.on(LasPaginaFalabella.BOTON_SEGUNDO),
                Click.on(LasPaginaFalabella.BOTON_TERCERO),
                Scroll.to(LasPaginaFalabella.BOTON_CUARTO),
                Click.on(LasPaginaFalabella.BOTON_CUARTO),
                Click.on(LasPaginaFalabella.BOTON_CINCO),
                Click.on(LasPaginaFalabella.BOTON_SEIS),
                Click.on(LasPaginaFalabella.BOTON_SIETE)



        );

    }
}
