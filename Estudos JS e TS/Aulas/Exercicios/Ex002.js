let nome = 'Fernando Araujo';
let idade = 33;
let peso = 103;
let alturaM = 1.85;
let anoNasc = 2022 - idade
const imc = peso / (alturaM * alturaM);

console.log(nome, 'tem', idade, 'anos e pesa', peso, 'Kg.');
console.log(`Tem, ${alturaM}, de altura e seu IMC é de, ${imc}`)
console.log('E', nome, 'nasceu em', anoNasc)
