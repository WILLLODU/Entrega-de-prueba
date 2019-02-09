package mystore.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LasPaginaFalabella {
    public static Target BOTON_PRIMERO = Target.the("Ir a categoria").located(By.xpath("//div[contains(@class,'12faL')]"));
    public static Target BOTON_SEGUNDO = Target.the("Ir a tecnologia").located(By.xpath("//p[contains(.,'Tecnología')]"));
    public static Target BOTON_TERCERO = Target.the("Ir a accesorios tv").located(By.xpath("(//a[contains(@class,'3gVVh')])[1]"));
    public static Target BOTON_CUARTO = Target.the("Ir a producto").located(By.xpath("(//img[@height='240'])[1]"));
    public static Target BOTON_CINCO = Target.the("cerrar banner  ").located(By.xpath("//div[@class='dy-lb-close']"));
    public static Target BOTON_SEIS = Target.the("Agregar a bolsa ").located(By.xpath("//button[contains(.,'Agregar a la Bolsa')]"));
    public static Target BOTON_SIETE = Target.the("Ver la bolsa de compra").located(By.xpath("//a[contains(.,'Ver Bolsa de Compras')]"));
    public static Target BOTON_OCHO = Target.the("Validar de que si estemos en la bolsa de compra").located(By.xpath("(//span[contains(.,'Bolsa de Compras')])[2]"));
}
