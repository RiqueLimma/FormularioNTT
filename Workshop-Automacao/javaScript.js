/*function buscarEndereco() {
    var cep = document.getElementById("cep").value;
    fetch(`https://viacep.com.br/ws/${cep}/json/`)
        .then(response => response.json())
        .then(data => {
            if (!data.erro) {
                document.getElementById("cidade").value = data.localidade;
                document.getElementById("estado").value = data.uf;
            } else {
                alert("CEP inválido");
            }
        });
}*/
