const numero = Number(prompt('Digite um número: '));
const numeroTitulo = document.getElementById('numero-titulo');
const elementoTexto = document.getElementById('texto');

numeroTitulo.innerHTML = numero;

elementoTexto.innerHTML = '';
elementoTexto.innerHTML += `<p>Raiz quadrada ${Math.sqrt(numero)}. </p>`;
elementoTexto.innerHTML += `<p>${numero} É inteiro? ${Number.isInteger(numero)}. </p>`;
elementoTexto.innerHTML += `<p>${numero} É NaN? ${Number.isNaN(numero)}. </p>`;
elementoTexto.innerHTML += `<p>${numero} arredondado para baixo ${Math.floor(numero)}. </p>`;
elementoTexto.innerHTML += `<p>${numero} arredondado para cima ${Math.ceil(numero)}. </p>`;
elementoTexto.innerHTML += `<p>${numero} com somente duas casas decimais ${numero.toFixed(2)}. </p>`;