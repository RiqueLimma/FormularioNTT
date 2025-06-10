package Step;


import Core.Base2;
import Funcionalidades.Elementos;
import Pages.CadastroPage;
import org.junit.Test;
import org.openqa.selenium.By;

public class Testando extends CadastroPage {

    Elementos elementos = new Elementos();
    @Test
    public void Chrome(){
        getDriver().get("https://www.google.com/");
        elementos.escrever(By.xpath("//textarea[@class='gLFyf']"), "carros");
        System.out.println("Título da página: " + getDriver().getTitle());
    }
}
