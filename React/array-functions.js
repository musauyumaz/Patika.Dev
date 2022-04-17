const users = [
  { name: "Mehmet", age: 30 },
  { name: "Ahmet", age: 25 },
  { name: "Murat", age: 28 },
];

/*
push
map
find
filter
some
every
includes
*/

//Push ==> arrayin sonuna eleman ekler
// users.push("Ayşe");
// users.push("Fatma");

// console.log(users);

//Map ==> array elemanlarına tek tek ulaşır
// users.map((item) =>
// {
//     console.log(item);
// })

//Find ==> verdiğiniz koşullara göre arama işlemi yapar

// const result = users.find((item) => item.name == "Mehmet" && item.age > 20);
// console.log(result);

//Filter ==> Filtreleme yapar
// const filtered = users.filter((item) => item.age > 25);
// console.log(filtered);

//Some ==> arrayin içindeki herahngi bir eleman verilen koşula uyuyorsa true döner uymazsa false döner
// const some = users.some((item) => item.age ===11 );
// console.log(some);

//Every ==> arrayin içindeki tüm elemanlar verilen koşula uyuyorsa true döner uymazsa false döner
// const every = users.every((item) => item.age > 5 );
// console.log(every);

//Includes ==> arrayin içinde girdiğiniz ifade geçiyor mu geçmiyor mu ?
const meyveler = ["Elma","Armut","Muz"];

const isIncluded = meyveler.includes("Muz");
console.log(isIncluded);