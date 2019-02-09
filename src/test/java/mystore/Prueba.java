package mystore;

import mystore.acciones.Decidido;
import mystore.acciones.PaginaFalabella;
import mystore.preguntas.LaPaginaFalabella;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;


import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static java.time.temporal.ChronoUnit.SECONDS;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SerenityRunner.class)
public class Prueba {
    Actor actor;
    @Managed
    WebDriver navegador;

    @Before
    public void prepararEscenario (){
        actor = Actor.named("william");
        actor.can(BrowseTheWeb.with(navegador));

    }
    @Test
    public void ValidarCompras (){
        BrowseTheWeb.as(actor).setImplicitTimeout(20, SECONDS);
        actor.has(Decidido.ingresar());

        actor.attemptsTo(PaginaFalabella.bancol());

        actor.should(seeThat("Bolsa de Compras",
                LaPaginaFalabella.primerTituloDeProducto(), equalTo("Bolsa de Compras")));

    }
}