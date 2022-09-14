function submitCep(){
    const cep = $("input#cep").val();
    $.ajax({
        type: "GET",
        url: "https://viacep.com.br/ws/" + cep + "/json/",
        dataType: "json",

        success:function(data){
            const elemento = '<div>' +
                '<span>Logradouro: ' + data.logradouro + '</span>' +
                '</div>'
            $(elemento).appendTo("#janela-conteudo");

        },
        error:function(){
            alert("Ops! Algo deu errado");
        }
    })
}


