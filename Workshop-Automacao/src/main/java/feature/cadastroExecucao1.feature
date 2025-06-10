#language: pt

Funcionalidade: Cadastro

  Cenário: Alteração de massa

    Dado acessar a pagina de cadastro
    Quando preencher os dados com "Luis Henrique", "Sousa Lima", "11999998888", "16/08/1993", "luis@email.com.br", "00000-999", "masculino", "superior_completo", "JavaScript"
    E aceita os termos
    E enviou o clico na envio de Cadastro
    Então O formulário deve ser enviado com sucesso
