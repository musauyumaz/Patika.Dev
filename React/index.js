import slugify from 'slugify'
import {hello,topla,cikar,users,user} from "./my-module.js"
console.log("Hello Node")

console.log(topla(2,4))
hello("Musa")
const title = slugify('some string lorem ipsum',"*")
console.log(title)
console.log(user)
console.log(users)
console.log(cikar(4,2));