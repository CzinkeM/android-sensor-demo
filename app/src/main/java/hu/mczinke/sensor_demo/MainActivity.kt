package hu.mczinke.sensor_demo

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import hu.mczinke.sensor_demo.ui.theme.SensordemoTheme
import org.koin.androidx.viewmodel.ext.android.getViewModel


private const val TAG = "MainActivity"

class MainActivity : ComponentActivity() {
    lateinit var listener: SensorEventListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SensordemoTheme {
                val viewModel = getViewModel<MainViewModel>()
                val x = viewModel.x
                val y = viewModel.y
                val z = viewModel.z
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column {
                        Greeting("Android")
                        CoordinateText(coordinateName = "X", coordinateValue = x)
                        CoordinateText(coordinateName = "Y", coordinateValue = y)
                        CoordinateText(coordinateName = "Z", coordinateValue = z)
                    }

                }
            }
        }
    }
}

@Composable
fun CoordinateText(coordinateName: String, coordinateValue: Float) {
    Text(text = "$coordinateName: $coordinateValue")
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SensordemoTheme {
        Greeting("Android")
    }
}