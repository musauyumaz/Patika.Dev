const menu = [
  {
    id: 1,
    title: "Tteokbokki",
    category: "Korea",
    price: 10.99,
    img:
      "https://twoplaidaprons.com/wp-content/uploads/2020/09/tteokbokki-top-down-view-of-tteokbokki-in-a-bowl-500x500.jpg",
    desc: `Spicy rice cakes, serving with fish cake.`,
  },
  {
    id: 2,
    title: "Chicken Ramen",
    category: "Japan",
    price: 7.99,
    img:
      "https://www.forkknifeswoon.com/wp-content/uploads/2014/10/simple-homemade-chicken-ramen-fork-knife-swoon-01.jpg",
    desc: `Chicken noodle soup, serving with vegetables such as soy bean, green onion. In an optional you can ask for egg. `,
  },
  {
    id: 3,
    title: "Bibimbap",
    category: "Korea",
    price: 8.99,
    img:
      "https://dwellbymichelle.com/wp-content/uploads/2020/05/DWELL-bibimbap.jpg",
    desc: `Boiling vegetables, serving with special hot sauce`,
  },
  {
    id: 4,
    title: "Dan Dan Mian",
    category: "China",
    price: 5.99,
    img:
      "https://www.savingdessert.com/wp-content/uploads/2019/02/Dan-Dan-Noodles-10.jpg",
    desc: `Dan dan noodle, serving with green onion `,
  },
  {
    id: 5,
    title: "Yangzhou Fried Rice",
    category: "China",
    price: 12.99,
    img:
      "https://salu-salo.com/wp-content/uploads/2013/02/Yangzhou-Fried-Rice1.jpg",
    desc: `Yangzhou style fried rice, serving with bean and pickles `,
  },
  {
    id: 6,
    title: "Onigiri",
    category: "Japan",
    price: 9.99,
    img:
      "https://www.manusmenu.com/wp-content/uploads/2017/08/Onigiri-3-1-of-1.jpg",
    desc: `Rice Sandwich, serving with soy sauce`,
  },
  {
    id: 7,
    title: "Jajangmyeon",
    category: "Korea",
    price: 15.99,
    img:
      "https://www.curiouscuisiniere.com/wp-content/uploads/2020/04/Jajangmyeon-Korean-Noodles-in-Black-Bean-Sauce5.1200H-720x540.jpg",
    desc: `Black bean sauce noodle, serving with green onion `,
  },
  {
    id: 8,
    title: "Ma Yi Shang Shu",
    category: "China",
    price: 12.99,
    img:
      "https://assets.tmecosys.com/image/upload/t_web767x639/img/recipe/ras/Assets/F688C2F6-86EC-46C4-B9C7-A6BA01DF7437/Derivates/32E3E72A-F786-406D-AF7F-B30980A9AC6C.jpg",
    desc: `Hot pepper sauce noodle, serving with soy bean and onion`,
  },
  {
    id: 9,
    title: "Doroyaki",
    category: "Japan",
    price: 3.99,
    img:
      "https://www.justonecookbook.com/wp-content/uploads/2011/10/Dorayaki-New-500x400.jpg",
    desc: `Red bean paste dessert, serving with honey.`,
  },
];

const getMenu = menu.map(x => x.category)
const buttonCreate = []
const buttonDOM = document.querySelector(".btn-container")

//Kaç kategori var ise onları sadece 1 kere yazmak için algoritma
for(i = 0; i < getMenu.length; i++){
  let x = getMenu.indexOf(getMenu[i])
  if(x>=i)
  {buttonCreate.push(getMenu[x])}
}
//Sabit, Tüm kategoriler Button'u
buttonDOM.innerHTML = `<button id="all" class="btn btn-item btn-outline-dark" onclick="getirFunction()">All</button>`

//Kategoriden Yarattığımız buttonCreate elemanının içinde kaç eleman varsa ismine göre yeni button açıyor
buttonCreate.forEach(element => {
  let button = document.createElement("button")
  buttonDOM.append(button)
  button.attributes = "id, class, onclick"
  button.id = `${element[0].toLocaleLowerCase() + element.substring(1)}`
  button.className = `btn btn-item btn-outline-dark`
  button.onclick = function() {getirFunction(element)}
  button.innerHTML=element
});

//Button'lara basınca işlem yapılacak işlem;
function getirFunction(item){

  if(item == undefined){
    //All için
    let divDOM = document.querySelector(".section-center")
    divDOM.innerHTML = ""
    for(i = 0; i < menu.length; i++){

      let divDOM = document.querySelector(".section-center")
      let deneme = document.createElement("div")
      deneme.className = `menu-items col-lg-6 col-sm-12`
      deneme.innerHTML = 
        `
          <img
            src=${menu[i].img}
            alt=${menu[i].title}
            class="photo"
          />
          <div class="menu-info">
            <div class="menu-title">
              <h4>${menu[i].title}</h4>
              <h4 class="price">${menu[i].price}</h4>
            </div>
            <div class="menu-text">
              ${menu[i].desc}
            </div>
          </div>
        `
      const divDOMHTML1 = []
      divDOMHTML1[i] = deneme
      divDOM.append(divDOMHTML1[i])
    }
    
  }else{
  //Kategoriler için
  let divDOM = document.querySelector(".section-center")
  divDOM.innerHTML = ""
    for(i=0; i<menu.length;i++){
      if(item == menu[i].category){
          let divDOM = document.querySelector(".section-center")
          let deneme = document.createElement("div")
          deneme.className = `menu-items col-lg-6 col-sm-12`
          deneme.innerHTML = 
            `
              <img
                src=${menu[i].img}
                alt=${menu[i].title}
                class="photo"
              />
              <div class="menu-info">
                <div class="menu-title">
                  <h4>${menu[i].title}</h4>
                  <h4 class="price">${menu[i].price}</h4>
                </div>
                <div class="menu-text">
                  ${menu[i].desc}
                </div>
              </div>
            `
          const divDOMHTML1 = []
          divDOMHTML1[i] = deneme
          divDOM.append(divDOMHTML1[i])
      

      }
    }
    
    
  }
}