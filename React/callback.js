// setTimeout(() =>{
//     console.log("Merhaba")
// },5000)

// setInterval(()=>
// {
//     console.log("Ben Her saniye çalışacağım")
// },1000)

// const sayHi =(cb) =>
// {
//    cb();
// };
// sayHi(()=>
// {
//     console.log("Hello")
// });

import fetch from "node-fetch";
import axios from "axios";
// fetch("https://jsonplaceholder.typicode.com/users/1") //apiden data döndükten yani response döndükten sonra
//   .then((data) => data.json()) //apiden ne geliyorsa data O'dur sonra biz burada fetch kütüphanesi doğrudan json dönmediği için json'a parse ediyoruz
//   .then((users) => {
//     console.log("User Yüklendi !", users);
//     fetch("https://jsonplaceholder.typicode.com/posts/1")
//       .then((data) => data.json())
//       .then((post) => {
//         console.log("Post 1 Yüklendi!,", post);
//         fetch('https://jsonplaceholder.typicode.com/posts/2')
//         .then((data)=>data.json())
//         .then((post2)=> console.log("Post 2 yüklendi",post2));
//       });
//   }); //jsondan gelen data users'a düşer ve oradan alıp kullanmaya devam ediyoruz

// async function getData() {
//   const user = await (
//     await fetch("https://jsonplaceholder.typicode.com/users/1")
//   ).json();
//   const post1 = await (
//     await fetch("https://jsonplaceholder.typicode.com/posts/1")
//   ).json();
//   const post2 = await (
//     await fetch("https://jsonplaceholder.typicode.com/posts/2")
//   ).json();

//   console.log("User", user);
//   console.log("Post1 ", post1);
//   console.log("Post2 ", post2);
// }

// getData();

// (async () => {
//   const {data : user} = await axios("https://jsonplaceholder.typicode.com/users/1");
//   const {data : post1} = await axios("https://jsonplaceholder.typicode.com/posts/1");
//   const {data : post2} = await axios("https://jsonplaceholder.typicode.com/posts/2");

//   console.log("User", user);
//   console.log("Post1 ", post1);
//   console.log("Post2 ", post2);
// })();

// const getComments = (number) => {
//   return new Promise((resolve, reject) => {
//     if(number == 1)
//     {
//         resolve({text: "Selam"});
//     }
//     reject("Bir Problem Oluştu");
//   });
// };

// getComments(1)
//   .then((data) => console.log(data))
//   .catch((e) => console.log(e));

const getUser = () => {
  return new Promise(async (resolve, reject) => {
    const { data: user } = await axios(
      "https://jsonplaceholder.typicode.com/users/2"
    );

    resolve(user);
    //reject("Bir Sorun Oluştu");
  });
};
const getPost = (postId) => {
  return new Promise(async (resolve, reject) => {
    const { data: post } = await axios(
      "https://jsonplaceholder.typicode.com/posts/" + postId
    );

    //resolve(post);
    reject("Bir Sorun daha Oluştu");
  });
};

// (async () => {
//   try {
//     const user = await getUser();
//     const post = await getPost(1);

//     console.log(user);
//     console.log(post);
//   } catch (error) {
//       console.log(error);
//   }
// })();

Promise.all([getUser(), getPost(1)])
.then(console.log)
.catch(console.log);
