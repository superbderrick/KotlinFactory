package superbderrick.github.io.kotlinfactory

class INDIACarFactory {
    fun buildCar(model: RecorderType): Recorder? {
        var recorder: Recorder? = null
        when (model) {
            RecorderType.MEDIAPROTECTION -> recorder = MDRecorder(Location.INDIA)

            RecorderType.MIDIACODEC -> recorder = MCRecorder(Location.INDIA)


            else -> {
            }
        }
        return recorder
    }
}