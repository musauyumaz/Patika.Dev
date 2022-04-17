const hello = (name) => {
  console.log("hello " + name);
  console.log(`hello ${name}`);
};

const topla = (a, b) => a + b;
const cikar = (a, b) => a - b;

const text = "text";
const user = {
  name: "Musa",
  surname: "Uyumaz",
};
const users = [
  {
    name: "Musa",
    surname: "Uyumaz",
  },
  {
    name: "Serhat",
    surname: "Uyumaz",
  },
];

export { hello, topla, cikar, user, users, text };
