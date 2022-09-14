let timer = setInterval(fadeOut, 4000);
// let timer = setInterval(trocarFoto(), 6000);

function trocarFoto() {

    let imagemFundo = window.document.getElementById("imagemFundo");

    if (imagemFundo.src === "http://localhost:63342/Entra_21_projeto_transportadora_html/img/empresa/caminhao1.jpeg") {
        imagemFundo.src = "http://localhost:63342/Entra_21_projeto_transportadora_html/img/empresa/aviao1.jpg";

    } else if (imagemFundo.src === "http://localhost:63342/Entra_21_projeto_transportadora_html/img/empresa/aviao1.jpg") {
        imagemFundo.src = "http://localhost:63342/Entra_21_projeto_transportadora_html/img/empresa/courier1.jpg";

    } else if (imagemFundo.src === "http://localhost:63342/Entra_21_projeto_transportadora_html/img/empresa/courier1.jpg") {
        imagemFundo.src = "http://localhost:63342/Entra_21_projeto_transportadora_html/img/empresa/caminhao1.jpeg";

    }
}

function fadeIn()
{
    imagemFundo.classList.remove("fade-out");
    imagemFundo.classList.add("fade-in");
}

function fadeOut()
{
    imagemFundo.classList.remove("fade-in");
    imagemFundo.classList.add("fade-out");

    // Add listener to the "transitionend" event.

    imagemFundo.addEventListener("transitionend", function x()
    {
        // Remove the previously added listener, change
        // the image and fade-in the new image.

        imagemFundo.removeEventListener("transitionend", x);
        trocarFoto();
        fadeIn();
    });
}