package recoder

import java.sql.DriverManager.println

class MDRecorder(mediaType: MediaType) : Recorder(RecorderType.MEDIAPROTECTION, mediaType) {
    init {
        construct()
    }

    override fun construct() {
        println("Created MDRecorder")
    }
}