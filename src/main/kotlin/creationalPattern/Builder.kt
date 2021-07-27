package creationalPattern

class Car private constructor(builder: Builder){

    var model: String? = null
    var gear: Int? = null
    var isWorking: Boolean? = null

    class Builder {

        private var model: String? = null
        private var gear: Int? = null
        private var isWorking: Boolean? = null

        fun setParam1(model: String) = apply { this.model = model }
        fun setParam2(gear: Int) = apply { this.gear = gear }
        fun setParam3(isWorking: Boolean) = apply { this.isWorking = isWorking }

        fun build() = Car(this)

        fun getCarModel() = model
        fun getCarGear() = gear
        fun getIsWorking() = isWorking

    }

    init {

        model = builder.getCarModel()
        gear = builder.getCarGear()
        isWorking = builder.getIsWorking()

    }

}

fun main(){

    val component = Car.Builder()
        .setParam1("X108")
        .setParam2(4)
        .setParam3(false)
        .build()

    println(component.model)

}