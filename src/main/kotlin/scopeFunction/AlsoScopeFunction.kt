package scopeFunction

/*
* Also scope function
* Return:          context object //return the original context object
* Context Object:  it           //refer object using this
* Used for to do additional operation and configuration on object
*/

fun main(){

    val list: MutableList<Int> = mutableListOf(1, 2, 3)

    val newList: MutableList<Int> = list.also {
        it.add(4)
        println(it)
        it.remove(1)
        println(it)
    }

    println(newList)

}