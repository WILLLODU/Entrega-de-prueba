package mystore.preguntas;

import mystore.ui.LasPaginaFalabella;


import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaPaginaFalabella {

    public static Question<String> primerTituloDeProducto(){
        return actor -> Text.of(LasPaginaFalabella.BOTON_OCHO)
                .viewedBy(actor).asString();
    }
}