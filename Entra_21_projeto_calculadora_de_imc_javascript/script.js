function verificar() {

    let existe = document.getElementById('container-3');
    let peso = document.getElementById('txt-peso').value;
    let altura = document.getElementById('txt-altura').value;
    if(peso == null || peso == 0 || altura == null || altura == 0){
        alert("Preencha os campos adequadamente.");
    } else {
        if (existe == null) {

            let section = document.getElementById('section')


            // let peso = document.getElementById('txt-peso').value;
            peso = pesoEmKg(peso);

            // let altura = document.getElementById('txt-altura').value;
            altura = alturaEmMetros(altura);

            let IMC = peso / (altura ** 2);
            let resultado;

            if (IMC < 18.5) {
                resultado = "Indivíduo abaixo do peso normal";
            } else if (IMC >= 18.5 && IMC < 25) {
                resultado = "Indivíduo com peso normal";
            } else if (IMC >= 25 && IMC < 30) {
                resultado = "Indivíduo com excesso de peso";
            } else if (IMC >= 30 && IMC < 35) {
                resultado = "Indivíduo com Obesidade nível I"
            } else if (IMC >= 35 && IMC < 40) {
                resultado = "Indivíduo com Obesidade nível II"
            } else if (IMC >= 40) {
                resultado = "Indivíduo com Obesidade nível III"
            }

            const containerResposta = document.createElement('div');
            containerResposta.setAttribute('id', 'container-3');

            const span1 = document.createElement("span");
            span1.setAttribute('id', 'span1');
            span1.appendChild(document.createTextNode("IMC = " + IMC.toFixed(2)));

            const span2 = document.createElement("span");
            span2.setAttribute('id', 'span2');
            span2.appendChild(document.createTextNode(resultado));

            containerResposta.appendChild(span1);
            containerResposta.appendChild(span2);
            section.appendChild(containerResposta);
        } else {
            limpa();
            verificar();
        }

    }
}

function limpa() {
    let elemento = document.getElementById('container-3');
    elemento.remove();
}


function alturaEmMetros(altura) {
    if (altura > 4) {
        return (altura / 100)
    }
    return altura;
}

function pesoEmKg(peso) {
    if (peso > 500) {
        return (peso / 1000);
    } else {
        return peso;
    }
}
