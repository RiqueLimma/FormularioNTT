package Step;

import Pages.CadastroPage;
import org.junit.Assert;
import org.junit.Test;

import static Core.Base2.getDriver;

public class CadastroStepTest {

    CadastroPage cadastroPage = new CadastroPage();

    public void abrirPagina() {
        getDriver().get("C:\\Users\\lsousali\\OneDrive - NTT DATA EMEAL\\Escritorio\\Links e acessos\\Projeto-workshop\\Formul-rioTreinamentoNTT\\Workshop-Automacao\\index.html");
    }

    //Via @Test
    @Test
    public void testCadastro() {
        abrirPagina();
        cadastroPage.preencherNome("Luis Henrique") //nome
                .preencherSobreNome("Sousa Lima") //sobreNome
                .preencherTelefone("11999998888") //telefone
                .preencherDataNascimento("16/08/1993") //dataNascimento
                .preencherEmail("luis@email.com.br") //email
                .preencherCEP("00000-999") //cep
                .preencherSexo("masculino") //sexo
                .preencherEscolaridade("superior_completo") //escolaridade
                .preencherTecnologias("JavaScript") //tecnologias
                .acetarCheckbok()
                .enviarCasdastro();

        Assert.assertEquals("Formulário Enviado", "Formulário Enviado");
    }
}
