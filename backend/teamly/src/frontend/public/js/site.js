let _loginBlockShowed = document.querySelector(".login").style.visibility === "visible"

function toggleLoginBlock()
{
    _loginBlockShowed = !_loginBlockShowed

    document.querySelector(".login").style.visibility = _loginBlockShowed ? "visible" : "hidden"
}