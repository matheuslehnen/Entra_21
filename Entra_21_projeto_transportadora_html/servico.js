function mostraCargaLotacao(){

    let existe = document.getElementById("artigoDinamico");


    if(existe == null) {
        const sectionServicos = document.getElementById('sectionServicosMain');

        const titulo = document.createElement("h1");
        titulo.appendChild(document.createTextNode("CARGA LOTAÇÃO"));

        const texto = document.createElement("p");
        texto.appendChild(document.createTextNode("Através de uma eficiente malha logística, a Transid oferece aos seus clientes a mais rápida e econômica solução em transporte de cargas fechadas. Com sistema de rastreamento 24 horas, com uma equipe especializada em gerenciamento de cargas, garantimos a entrega e segurança do material da coleta a entrega."));

        const article = document.createElement("article");
        article.setAttribute("id", "artigoDinamico")
        article.appendChild(titulo);
        article.appendChild(texto);

        sectionServicos.appendChild(article);

    } else {
        limpaContainer();
        mostraCargaLotacao();
    }
}


function mostraQuimicos(){

    let existe = document.getElementById("artigoDinamico");

    if(existe == null) {
        const sectionServicos = document.getElementById('sectionServicosMain');

        const titulo = document.createElement("h1");
        titulo.appendChild(document.createTextNode("QUÍMICOS"));

        const texto = document.createElement("p");
        texto.appendChild(document.createTextNode("Com colaboradores capacitados, equipamentos de ponta, todas as licenças necessárias ao transporte, a Transid está habilitada para o transporte de Produtos Químicos e Produtos Perigosos. Especializada no segmento a Transid é qualificada pelo SASSMAQ (Sistema de Avaliação de Segurança, Saúde, Meio Ambiente e Qualidade) atendendo todos os requisitos avaliados pelos órgãos certificadores."));

        const article = document.createElement("article");
        article.setAttribute("id", "artigoDinamico")
        article.appendChild(titulo);
        article.appendChild(texto);

        sectionServicos.appendChild(article);

    } else {
        limpaContainer();
        mostraQuimicos();
    }
}

function mostraCargaFracionada(){

    let existe = document.getElementById("artigoDinamico");


    if(existe == null) {
        const sectionServicos = document.getElementById('sectionServicosMain');

        const titulo = document.createElement("h1");
        titulo.appendChild(document.createTextNode("CARGA FRACIONADA"));

        const texto = document.createElement("p");
        texto.appendChild(document.createTextNode("A Transid é especializada no transporte de cargas fracionadas e possui infraestrutura de frota e terminais adequados para oferecer um serviço de alta qualidade no transporte para este segmento. Frota equipada com o que há de mais moderno em tecnologia de rastreamento. Garantindo assim que sua carga chegue ao destino no menor tempo e com a maior segurança."));

        const article = document.createElement("article");
        article.setAttribute("id", "artigoDinamico")
        article.appendChild(titulo);
        article.appendChild(texto);

        sectionServicos.appendChild(article);

    } else {
        limpaContainer();
        mostraCargaFracionada();
    }
}


function limpaContainer(){
    let elemento =  document.getElementById("artigoDinamico");
    elemento.remove();
}