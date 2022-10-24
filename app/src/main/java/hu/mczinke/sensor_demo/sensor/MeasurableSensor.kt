package hu.mczinke.sensor_demo.sensor

import android.hardware.Sensor

abstract class MeasurableSensor(protected val sensorType: Int) {

    protected var onSensorValueChanged: ((List<Float>) -> Unit)? = null

    abstract val doesSensorExist: Boolean

    abstract fun startListening()
    abstract fun stopListening()

    fun setOnSensorValuesChangedListener(listener: ((List<Float>)-> Unit)) {
        onSensorValueChanged = listener
    }
}