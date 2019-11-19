package recorder

import java.sql.DriverManager.println

class MicroCar(location: Location) : Car(CarType.MICRO, location) {
    init {
        construct()
    }

    override fun construct() {
        println("Connecting to Micro Car ")
    }
}