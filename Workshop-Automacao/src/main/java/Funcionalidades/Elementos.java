package Funcionalidades;

import Core.Base2;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elementos extends Base2 {

    public WebDriverWait wait;

    //Busca de elementos
    public WebElement findElement(String selectorValue, String selectorType) {

        WebElement element;

        try {
            switch (selectorType) {
                case "id":
                    element = getDriver().findElement(By.id(selectorValue));
                    break;
                case "name":
                    element = getDriver().findElement(By.name(selectorValue));
                    break;
                case "xpath":
                    element = getDriver().findElement(By.xpath(selectorValue));
                    break;
                default:
                    throw new InvalidArgumentException("Invalid selector type: " + selectorType);
            }
            return element;
        } catch (Exception e) {
            return null;
        }
    }

    public void escrever(By campo, String texto) {
        getDriver().findElement(campo).sendKeys(texto);
    }

    public String retornaTitulo() {
        return getDriver().getTitle();
    }

    public void esperaElementoClicavel(By elemento) {
        wait.until(ExpectedConditions.elementToBeClickable(
                (elemento))).click();
    }

    public By clickElement(String selectorValue, String selectorType) {
        findElement(selectorValue, selectorType).click();
        return By.id(selectorValue);
    }

    public void esperaTry(Long tempo) {
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void selecionarOpcao(By id, String opcao) {
        WebElement selectElement = getDriver().findElement(id);
        Select select = new Select(selectElement);
        select.selectByValue(opcao);
    }
}
