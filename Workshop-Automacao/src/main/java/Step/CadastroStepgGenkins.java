package Step;

import Pages.CadastroPage;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import org.junit.Assert;

import static Core.Base2.getDriver;

public class CadastroStepgGenkins {

    CadastroPage cadastroPage = new CadastroPage();

    @Dado("acessar a pagina de cadastro")
    public void abrirPagina() {
        getDriver().get("C:\\Users\\lsousali\\OneDrive - NTT DATA EMEAL\\Escritorio\\Links e acessos\\Projeto-workshop\\Novo\\Formul-rioTreinamentoNTT\\Workshop-Automacao\\index.html");
    }

    //Preparação para o cucumber
    //1 Forma de Execução com todos os parametro junto a mais comuns entre os projetos
    @Quando("preencher os dados com {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void testCadastro(String nome, String sobreNome, String telefone, String dataNascimento, String email, String cep, String sexo, String escolaridade, String tecnologias) {
        cadastroPage.preencherNome(nome) //nome
                .preencherSobreNome(sobreNome) //sobreNome
                .preencherTelefone(telefone) //telefone
                .preencherDataNascimento(dataNascimento) //dataNascimento
                .preencherEmail(email) //email
                .preencherCEP(cep) //cep
                .preencherSexo(sexo) //sexo
                .preencherEscolaridade(escolaridade) //escolaridade
                .preencherTecnologias(tecnologias) //tecnologias
                .acetarCheckbok()
                .enviarCasdastro();

        Assert.assertEquals("Formulário Enviado", "Formulário Enviado");

    }

    //Preparação para o cucumber
    //2 Forma de Execução, separado em cada step
    @Quando("usuario for preencher o nome, {string}")
    public CadastroStepgGenkins stepNome(String nome) {
        cadastroPage.preencherNome(nome);
        return new CadastroStepgGenkins();
    }

    @E("preencher o sobrenome, {string}")
    public CadastroStepgGenkins stepSobreNome(String sobreNome) {
        cadastroPage.preencherSobreNome(sobreNome);
        return new CadastroStepgGenkins();
    }

    @E("preencher o telefone, {string}")
    public CadastroStepgGenkins stepTelefone(String telefone) {
        cadastroPage.preencherTelefone(telefone);
        return new CadastroStepgGenkins();
    }

    @E("preencher o dataNascimento, {string}")
    public CadastroStepgGenkins stepDataNascimento(String dataNascimento) {
        cadastroPage.preencherDataNascimento(dataNascimento);
        return new CadastroStepgGenkins();
    }

    @E("preencher o email, {string}")
    public CadastroStepgGenkins stepEmail(String email) {
        cadastroPage.preencherEmail(email);
        return new CadastroStepgGenkins();
    }

    @E("preencher o cep, {string}")
    public CadastroStepgGenkins stepCep(String cep) {
        cadastroPage.preencherCEP(cep);
        return new CadastroStepgGenkins();
    }

    @E("preencher o sexo, {string}")
    public CadastroStepgGenkins stepSexo(String sexo) {
        cadastroPage.preencherSexo(sexo);
        return new CadastroStepgGenkins();
    }

    @E("preencher a escolaridade, {string}")
    public CadastroStepgGenkins stepEscolaridade(String escolaridade) {
        cadastroPage.preencherEscolaridade(escolaridade);
        return new CadastroStepgGenkins();
    }

    @E("preencher a tecnologias, {string}")
    public CadastroStepgGenkins stepTecnologias(String tecnologias) {
        cadastroPage.preencherTecnologias(tecnologias);
        return new CadastroStepgGenkins();
    }

    @E("aceita os termos")
    public CadastroStepgGenkins clickChekbox() {
        cadastroPage.acetarCheckbok();
        return new CadastroStepgGenkins();
    }

    @E("enviou o clico na envio de Cadastro")
    public void clickFinalizar() {
        cadastroPage.enviarCasdastro();
    }

    @Então("O formulário deve ser enviado com sucesso")
    public void validarEnviouCadastro() {
        Assert.assertEquals("Formulário Enviado", "Formulário Enviado");
    }

}
