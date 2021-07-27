package scopeFunction

/*
* Apply scope function
* Return:          context object //return the original context object
* Context Object:  this           //refer object using this
* Used for initialization or configuration of the object
*/

class Animal{

    var name: String? = null
    var leg: Int? = null

    //apply function inside class
    fun setName(name: String) = apply {this.name = name}
    fun setLeg(leg: Int) = apply { this.leg = leg }

}

fun main(){

    val dog = Animal().apply {
        name = "Dog"
        leg = 4
    }

    println(dog.name)

}