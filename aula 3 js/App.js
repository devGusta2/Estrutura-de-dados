console.log("Olá mundo!")

let nome = "Gusta";
let idade = 19;
let altura = 1.70;
let vazio;

let objeto={
    "nome": "Gusta",
    "idade": 19,
    "altura":1.75,
}
// console.log(nome, idade, altura, null, true, false, vazio)
let objeto2={
    nome,
    idade,
    altura,
}
console.log(objeto2)

let modelos = ['gol','Corsa','Fusca'];
let marcas = Array('Chevrolet', 'Ford', 'Fiat');
let acessorios = new Array(5);
let cores = [];
let categoria = new Array();

// console.log(modelos);
// console.log(marcas);

// console.log(acessorios)
console.log(modelos[0])
console.log(modelos[1])
console.log(modelos[2])

let nome_modelo = modelos[0];
modelos.push("Hb20");
modelos.unshift("Logan")
console.log(modelos)

//

let frutas = ['Laranja', 'Melância', 'Morango']
let vegetais = ['Batata doce', 'Cenoura', 'Milho']
let feira = frutas.concat(vegetais)

let fruta_s = frutas.splice(1,3,'Manga','Abacaxi');

let r = frutas.includes('Morango');
let r1 = frutas.includes('Maracuja')

console.log(fruta_s)