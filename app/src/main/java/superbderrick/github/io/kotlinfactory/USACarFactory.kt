package superbderrick.github.io.kotlinfactory

internal object USACarFactory {
    fun buildCar(model: RecorderType): Recorder? {
        var recorder: Recorder? = null
        when (model) {
            RecorderType.MEDIAPROTECTION -> recorder = MDRecorder(Location.USA)

            RecorderType.MIDIACODEC -> recorder = MCRecorder(Location.USA)

            else -> {
            }
        }
        return recorder
    }
}