package recoder


class RecorderFactory {
    fun buildCar(type: RecorderType): Recorder? {
        var recorder: Recorder? = null

        val location = MediaType.AUDIOONLY

        when (location) {
            MediaType.VIDEOONLY -> recorder = VideoFactory.buildCar(type)

            MediaType.AUDIOONLY -> recorder = AudioFactory().buildCar(type)

            else -> recorder = buildCar(type)
        }

        return recorder

    }
}