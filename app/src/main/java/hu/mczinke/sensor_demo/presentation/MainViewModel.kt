package hu.mczinke.sensor_demo.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import hu.mczinke.sensor_demo.sensor.GyroscopeSensor

class MainViewModel(
    private val gyroscopeSensor: GyroscopeSensor
): ViewModel() {
    var x by mutableStateOf(0f)
    var y by mutableStateOf(0f)
    var z by mutableStateOf(0f)

    init {
        gyroscopeSensor.startListening()
        gyroscopeSensor.setOnSensorValuesChangedListener { values ->
            val sensorX = values[0]
            val sensorY = values[1]
            val sensorZ = values[2]

            x = sensorX
            y = sensorY
            z = sensorZ

//            val sensorEstimatedX = values[3]
//            val sensorEstimatedY = values[4]
//            val sensorEstimatedZ = values[5]


        }
    }
}