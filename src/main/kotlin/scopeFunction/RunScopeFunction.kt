package scopeFunction

/*
* With scope function
* Return:          lambda result  //return the last statement in the block of code
* Context Object:  this           //refer object using this
* Used for to do some operation on null object as well return lambda and avoid NullPointerException
*/

fun main() {

    val animal: Animal? = null;

    val ageAfterFiveYear = animal?.run {
        println(name)
        println(leg)
        leg = leg?.minus(1) //return statement
    }

}

