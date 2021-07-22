alert("Privet")
alert("Вы уверены , что хотите продолжить дальше?")
var alertFunction = function () {
    for (var i = 0; i <= 10; i++) {
        alert("Значение счетчика: " + i)
        if (i = 5){
            alert("Ускорим" + i * 2)
            break
        }
    }
}

testFunc(alertFunction);