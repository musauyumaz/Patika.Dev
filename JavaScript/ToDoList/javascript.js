const newTodoDOM = document.querySelector('#task');
const addButtonDOM = document.querySelector('#liveToastBtn');
const listDOM = document.querySelector('#list');
let todos = [];    // localStorage'ta todo'lar icin bir liste olusturduk.

// HTML'de hazir gelen li'ler icin 
var liItems = document.querySelectorAll('li');
liItems.forEach(item => {
    todos.push(item.innerHTML);
    item.innerHTML += `<button style="padding-right: 5px; padding-top:5px;" class="close">&times</button>`;
});
localStorage.setItem('todos', JSON.stringify(todos));  // hazir gelen li'leri attik localStorage'a

// yeni todo ekleme islemi ve toast'larin calistirilmasi
addButtonDOM.addEventListener('onclick', newElement);
function newElement() {
    if (newTodoDOM.value.length > 0) {
        addItem(newTodoDOM.value);
        // $('.success').toast('show');
        showToastSuccess();
    } else {
        // $('.error').toast('show');
        showToastError();
    }
    newTodoDOM.value = "";     // yeni yapilacaklar girisi icin input'un textini siliyoruz
}

const addItem = (newTodo) => {
    listDOM.innerHTML += `<li>${newTodo}<button style="padding-right: 5px; padding-top:5px;" class="close">&times</button></li>`;
    todos.push(newTodo);
    localStorage.setItem('todos', JSON.stringify(todos));     // eklenen li'leri attik localStorage'a
}

// TOAST trigger functions
function showToastSuccess() {
    const toastSuccess = document.querySelector('#liveToast.success');
    var toast = new bootstrap.Toast(toastSuccess);
    toast.show();
}

function showToastError() {
    const toastError = document.querySelector('#liveToast.error');
    var toast = new bootstrap.Toast(toastError);
    toast.show();
}

// todo done checked or remove
listDOM.addEventListener('click', clickEvent);
function clickEvent(e) {
    if (e.target.className == 'close') {
        e.target.parentElement.remove();

        let removeTodo = ((e.target.parentElement.textContent).slice(0, -1));   // sonundaki x harfini yani close button'un capisini sildik
        for (let i = 0; i < todos.length; i++) {
            if (todos[i] == removeTodo) {
                todos.splice(i, 1);
            }
        }
        localStorage.setItem('todos', JSON.stringify(todos));      // remove edilmis li'leri dustuk localStorage'dan
    }
    else { e.target.classList.toggle('checked'); }
}