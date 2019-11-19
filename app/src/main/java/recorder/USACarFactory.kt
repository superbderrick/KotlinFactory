package recorder

internal object USACarFactory {
    fun buildCar(model: CarType): Car? {
        var car: Car? = null
        when (model) {
            CarType.MICRO -> car = MicroCar(Location.USA)

            CarType.MINI -> car = MiniCar(Location.USA)

            CarType.LUXURY -> car = LuxuryCar(Location.USA)

            else -> {
            }
        }
        return car
    }
}