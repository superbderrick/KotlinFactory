package recorder


class CarFactory {
    fun buildCar(type: CarType): Car? {
        var car: Car? = null

        val location = Location.INDIA

        when (location) {
            Location.USA -> car = USACarFactory.buildCar(type)

            Location.INDIA -> car = INDIACarFactory().buildCar(type)

            else -> car = buildCar(type)
        }

        return car

    }
}