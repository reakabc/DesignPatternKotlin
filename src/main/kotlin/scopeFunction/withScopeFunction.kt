package scopeFunction

/*
* With scope function
* Return:          lambda result  //return the last statement in the block of code
* Context Object:  this           //refer object using this
* Used for to do some operation on non null object
*/

class Person{

    var name: String = ""
    var age: Int = 0;

    //we can also use this.apply here
    fun setParams(name: String, age: Int) = apply {
        this.name = name
        this.age = age
    }

}

fun main(){

    var person1 = Person().setParams("ReaK AbC", 22);

    var duplicatePerson1: Person = with(person1){
        name = "ReaK" //we can use this.name as well
        println(name)
        this //returning lambda
    }

    var extendedAge: Int = with(person1){
        name = "ReaK" //we can use this.name as well
        age = age.plus(5)
        println(name)
        age //returning lambda
    }

    println(duplicatePerson1.name)
    println(extendedAge)

}