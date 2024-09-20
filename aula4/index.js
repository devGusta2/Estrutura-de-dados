let frutas = ['Maçã','Laranja','Bacaxi'];
let texto = frutas.join(',');
console.log(texto);


//map


let n = [1,2,3,4,5];

let dobro = n.map(x => x*2 );

console.log(dobro);


let nF = [3,5,7,9,8];

let par = nF.filter(x => x%2===0);
console.log(par)
//ternário, nao atende se houver a necessidade de um else if
nota = 2;
res =  nota>=6 ?  "Aprovado" : "Reprovado";
console.log(res)


//find
let nFind = [1,2,3,4,5];
let find = nFind.find(x => x > 2);
console.log(find);

let finI = nFind.findIndex(x => x > 2);
console.log(finI);