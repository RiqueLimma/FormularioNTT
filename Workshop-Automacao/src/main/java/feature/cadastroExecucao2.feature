#language: pt

Funcionalidade: Cadastro

  Cenário: Alteração de massa
    Forma mais usada nos projetos, são separa as classes para se reutilizadas em Pages e criando cada Step de uma ação

    Dado acessar a pagina de cadastro
    Quando usuario for preencher o nome, "Luis Henrique"
    E preencher o sobrenome, "Sousa Lima"
    E preencher o telefone, "11999998888"
    E preencher o dataNascimento, "16/08/1993"
    E preencher o email, "luis@email.com.br"
    E preencher o cep, "00000-999"
    E preencher o sexo, "masculino"
    E preencher a escolaridade, "superior_completo"
    E preencher a tecnologias, "JavaScript"
    E aceita os termos

    E enviou o clico na envio de Cadastro
    Então O formulário deve ser enviado com sucesso
