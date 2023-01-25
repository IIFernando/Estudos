// (condição) ?-> Valor se verdadeiro  : -> Valor se falso 

const pontuacaoUsuario = 500;
const corUsuario = null;

const nivelUsuario = pontuacaoUsuario >= 1000 ? 'Usuário VIP' : 'Usuário NORMAL';
const corPadrao = corUsuario || 'Preta';

console.log(nivelUsuario,  corPadrao);

//if(pontuacaoUsuario >= 1000){
//    console.log('Usuário VIP.');
//} 
//else {
//    console.log('Usuário NORMAL.');
//}