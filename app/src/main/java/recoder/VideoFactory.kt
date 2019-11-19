package recoder

internal object VideoFactory {
    fun buildCar(model: RecorderType): Recorder? {
        var recorder: Recorder? = null
        when (model) {
            RecorderType.MEDIAPROTECTION -> recorder = MDRecorder(MediaType.VIDEOONLY)

            RecorderType.MIDIACODEC -> recorder = MCRecorder(MediaType.VIDEOONLY)

            else -> {
            }
        }
        return recorder
    }
}