package creationalPattern

/* Created by ReaK AbC on 26/07/2021 */

/* Singleton class without any parameters */
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

/* Singleton class with parameters */

class SingletonClass private constructor(name: String){

    init {
        println("Single class created with name $name")
    }

    companion object : SingletonHolder<SingletonClass, String>(::SingletonClass);

}

open class SingletonHolder<out T: Any, in A>(creator: (A)->T){

    private var creator: ((A)->T)? = creator
    @Volatile private var instance: T? = null;

    fun getInstance(arg: A): T{
        val checkInstance = instance
        if (checkInstance != null){
            return checkInstance;
        }

        return synchronized(this){
            val checkInstanceAgain = instance
            if (checkInstanceAgain != null){
                checkInstanceAgain
            }else{
                val created = creator!!(arg)
                instance = created
                creator = null
                created
            }
        }
    }

}

fun main(args: Array<String>){

    /*val name = Singleton.getCreatorName();
    println(name?.length)*/

    SingletonClass.getInstance("Nitish Kumar"); //only this will create the single object
    SingletonClass.getInstance("Reak AbC")
    SingletonClass.getInstance("Reak AbC")
    SingletonClass.getInstance("Reak AbC")


}