package Pages;

import Core.Base2;
import Funcionalidades.Elementos;
import org.openqa.selenium.By;


public class CadastroPage extends Base2 {

    Elementos elementos = new Elementos();

    /**
     * Exemplos de Busca de Elementos
     * Tipos de pesquisas dos ELementos
     * Xpath = //input[@id="nome"]
     * Xpath = //input[@name="nome"]
     * Id = id="nome"
     * css  = #nome
     *
     */


    public CadastroPage preencherNome(String nome) {
        elementos.escrever(By.id("nome"), nome);
        return new CadastroPage();
    }

    public CadastroPage preencherSobreNome(String sobreNome) {
        elementos.escrever(By.id("sobrenome"), sobreNome);
        elementos.esperaTry(1000L);
        return new CadastroPage();
    }

    public CadastroPage preencherTelefone(String telefone) {
        elementos.escrever(By.id("telefone"), telefone);
        elementos.esperaTry(2000L);
        return new CadastroPage();
    }

    public CadastroPage preencherDataNascimento(String dataNascimento) {
        elementos.escrever(By.id("data_nascimento"), dataNascimento);
        elementos.esperaTry(1000L);
        return new CadastroPage();
    }
    public CadastroPage preencherEmail(String email) {
        elementos.escrever(By.id("email"), email);
        return new CadastroPage();
    }

    public CadastroPage preencherCEP(String cep) {
        elementos.escrever(By.id("cep"), cep);
        return new CadastroPage();
    }

    public CadastroPage preencherSexo(String sexo) {
        elementos.clickElement("//input[@value=\""+sexo+"\"]", "xpath");
        elementos.esperaTry(1000L);
        return new CadastroPage();
    }

    public CadastroPage preencherEscolaridade(String escolaridade) {
        elementos.selecionarOpcao(By.id("escolaridade"), escolaridade);
        return new CadastroPage();
    }

    public CadastroPage preencherTecnologias(String tecnologias) {
        elementos.selecionarOpcao(By.xpath("//select[@name=\"tecnologias\"]"), tecnologias);
        elementos.esperaTry(1000L);
        return new CadastroPage();
    }

    public CadastroPage acetarCheckbok() {
        elementos.clickElement("termos_condicoes", "id");
        elementos.esperaTry(1000L);
        return new CadastroPage();
    }

    public void enviarCasdastro() {
        elementos.clickElement("//button[contains(.,'Enviar')]", "xpath");
        elementos.esperaTry(2000L);
    }
}
