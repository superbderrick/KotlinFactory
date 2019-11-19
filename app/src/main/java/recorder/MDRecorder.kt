package recorder

import java.sql.DriverManager.println

class MDRecorder(location: Location) : Recorder(RecorderType.MEDIAPROTECTION, location) {
    init {
        construct()
    }

    override fun construct() {
        println("Connecting to Micro Recorder ")
    }
}