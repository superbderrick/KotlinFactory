package recorder

import java.sql.DriverManager.println


class MCRecorder(location: Location) : Recorder(RecorderType.MIDIACODEC, location) {
    init {
        construct()
    }

    override fun construct() {
        println("Connecting to Mini car")
    }
}