package recoder

import java.sql.DriverManager.println


class MCRecorder(mediaType: MediaType) : Recorder(RecorderType.MIDIACODEC, mediaType) {
    init {
        construct()
    }

    override fun construct() {
        println("Created MCRecorder")
    }
}