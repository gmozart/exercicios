function comparaNumeros(num1, num2){

  const primeiraFase = criaPrimeiaFrase(num1,num2);
  const segundaFase =  criaSegundaFrase(num1, num2);

}

function criaPrimeiaFrase(num1, num2){
    let saoIguais = '';

    if(num1 !== num2){
        saoIguais =  'não';
     }

    return ` Os numeros ${num1} e ${num2} ${saoIguais} sao iguais.`;
}

function criaSegundaFrase(num1, num2){

    const soma = num1+num2;
    const compara10 = soma > 10;
    const compara20 = soma < 10;

    return `Sua soma é ${soma} e `
}