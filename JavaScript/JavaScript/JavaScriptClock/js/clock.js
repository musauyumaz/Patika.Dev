let userName = prompt("Adınızı Giriniz");
let userNameAlani = document.querySelector("#myName");
let saatAlani = document.querySelector("#myClock");

if (username != null) {
  usernameAlani.innerHTML = userName;
} else {
  userNameAlani.innerHTML = "Boş";
}

function showTime() {
  let zaman = new Date();
  let gun = zaman.getDay.toString();
  let stringGun ="";
  let saat = zaman.getHours();
  let dakika = zaman.getMinutes();
  let saniye = zaman.getSeconds();

  if (gun == 1) {
    stringGun = "Pazartesi";
  }
  if (gun == 2) {
    stringGun = "Salı";
  }
  if (gun == 3) {
    stringGun = "Çarşamba";
  }
  if (gun == 4) {
    stringGun = "Perşembe";
  }
  if (gun == 5) {
    stringGun = "Cuma";
  }
  if (gun == 6) {
    stringGun = "Cumartesi";
  }if (gun ==7) {
    stringGun = "Pazar";
  }

  let clock = `${saat} : ${dakika} : ${saniye} ${stringGun}`;

  saatAlani.innerHTML = clock;
  setTimeout(showTime(), 1000);
}
showTime();
