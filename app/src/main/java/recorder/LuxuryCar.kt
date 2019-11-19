package recorder

import java.sql.DriverManager.println


class LuxuryCar(location: Location) : Car(CarType.LUXURY, location) {
    init {
        construct()
    }

    override fun construct() {
        println("Connecting to luxury car")
    }
}