package recorder


class RecorderFactory {
    fun buildCar(type: RecorderType): Recorder? {
        var recorder: Recorder? = null

        val location = Location.INDIA

        when (location) {
            Location.USA -> recorder = USACarFactory.buildCar(type)

            Location.INDIA -> recorder = INDIACarFactory().buildCar(type)

            else -> recorder = buildCar(type)
        }

        return recorder

    }
}