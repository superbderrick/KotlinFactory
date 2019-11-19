package superbderrick.github.io.kotlinfactory

import java.sql.DriverManager.println


class MCRecorder(location: Location) : Recorder(RecorderType.MIDIACODEC, location) {
    init {
        construct()
    }

    override fun construct() {
        println("Created MCRecorder")
    }
}