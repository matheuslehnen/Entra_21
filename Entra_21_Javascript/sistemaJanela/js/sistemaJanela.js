const menu = "#menu-ativo";
function start() {
    if ($(menu).is(":visible")) {
        esconderElemento($(menu));
    } else {
        mostrarElemento($(menu));
    }
}

function esconderElemento(elemento) {
    $(elemento).hide();
}

function mostrarElemento(elemento) {
    $(elemento).show();
}


function abrirJanela(elemento) {

    esconderElemento($(menu));

    $("#janela-conteudo").find(".dados:not(.template)").remove();
    let dados = $("#janela-conteudo").find(".dados.template").clone().removeClass("template");

    if ($(elemento).hasClass("tabuada")) {
        $('#janela').find('#titulo').text("Tabuada");
        $(dados).text("Tabuada");
    }
    if ($(elemento).hasClass("imc")) {
        $('#janela').find('#titulo').text("IMC");
        $(dados).text("IMC");
    }
    if ($(elemento).hasClass("calculadora")) {
        $('#janela').find('#titulo').text("Caluladora");
        $(dados).text("Calculadora");
    }
    if ($(elemento).hasClass("cep")) {
        $('#janela').find('#titulo').text("Exemplo CEP");
        const form =
            '<label for="cep"> CEP: </label> ' +
            '<input id="cep" type="text">' +
            '<button id="enviar_cep" value="Enviar" class="btn btn-success">Enviar</button>';
        $(form).appendTo(dados);
        $('#janela').on("click", "#enviar_cep", submitCep);
    }
    if ($(elemento).hasClass("ibge")) {
        $('#janela').find('#titulo').text("Exemplo IBGE")
        const select =
            '<label for="estado"> Estado: </label>' +
            '<select id="estado" onchange="getActionEstado()"></select>';
        $(select).appendTo(dados);
        getEstado();
    }
    $(dados).appendTo("#janela-conteudo");
    $('#janela').show();
}

