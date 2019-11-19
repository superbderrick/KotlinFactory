package recoder

class AudioFactory {
    fun buildCar(model: RecorderType): Recorder? {
        var recorder: Recorder? = null
        when (model) {
            RecorderType.MEDIAPROTECTION -> recorder = MDRecorder(MediaType.DEFAULT)

            RecorderType.MIDIACODEC -> recorder = MCRecorder(MediaType.AUDIOONLY)


            else -> {
            }
        }
        return recorder
    }
}