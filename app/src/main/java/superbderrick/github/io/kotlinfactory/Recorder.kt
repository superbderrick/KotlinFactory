package superbderrick.github.io.kotlinfactory


abstract class Recorder(model: RecorderType, location: Location) {

    var model: RecorderType? = null
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
