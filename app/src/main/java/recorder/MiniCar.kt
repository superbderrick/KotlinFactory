package recorder

import java.sql.DriverManager.println


class MiniCar(location: Location) : Car(CarType.MINI, location) {
    init {
        construct()
    }

    override fun construct() {
        println("Connecting to Mini car")
    }
}