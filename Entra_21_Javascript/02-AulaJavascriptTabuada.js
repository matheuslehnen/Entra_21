

function calcular(){
    let tab1 = document.getElementById("tab1").value;
    let tab2 = document.getElementById("tab2").value;



    if(tab2 < tab1) {
        let aux = tab2;
        tab2 = tab1;
        tab1 = aux;
    }

    const container = document.createElement("ul");

    do {

        for(let i = 1; i <= 10; i++){
            let linha = document.createElement("li");
            linha.className = "tab" + tab1;
            let result = tab1 + " x " + i + " = " + tab1*i;
            linha.appendChild(document.createTextNode(result));
            container.appendChild(linha);
        }



        tab1++;
    } while (tab1 < tab2);

    //adicionando o container dentro do elemento body
    document.body.appendChild(container);

}
