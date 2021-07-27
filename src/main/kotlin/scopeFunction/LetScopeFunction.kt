package scopeFunction

/*
* With scope function
* Return:          lambda result  //return the last statement in the block of code
* Context Object:  it           //refer object using this
* Used for to do some operation on null object asw well (Just advance then with)
*/

fun main() {

    val name: String? = null //here we can't use with scope function
    val result: String? = name?.let {
        println(it.reversed())
        println(it.capitalize())
        "Got It!" //we can skip this line to not return lambda function as shown below
    }

    name?.let {
        println(it.reversed())
        println(it.capitalize())
    }

    println(result)

}