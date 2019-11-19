package superbderrick.github.io.kotlinfactory

import java.sql.DriverManager.println

class MDRecorder(location: Location) : Recorder(RecorderType.MEDIAPROTECTION, location) {
    init {
        construct()
    }

    override fun construct() {
        println("Created MDRecorder")
    }
}