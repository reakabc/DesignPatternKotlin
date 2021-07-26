package creationalPattern

/* Created by ReaK AbC on 26/07/2021 */

object Singleton{

    var createdBy : String? = null // ? -> createdBy can be null

    init {
        println("Singleton object created")
        createdBy = "ReaK AbC"
    }

    fun getCreatorName():String? {
        return createdBy
    }
}

fun main(args: Array<String>){

    val name = Singleton.getCreatorName();
    println(name?.length)

}