package recorder


abstract class Car(model: CarType, location: recorder.Location) {

    var model: CarType? = null
    var location: Location? = null

    init {
        this.model = model
        this.location = location
    }

    abstract fun construct()

    override fun toString(): String {
        return "CarModel - $model located in $location"
    }
}
