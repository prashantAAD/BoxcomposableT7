package revengerfitness.boxcomposablet7

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}


@Preview(showBackground = true
    , widthDp = 300, heightDp = 500)
@Composable
private fun PreviewFunction(){
   Box(contentAlignment = Alignment.BottomCenter) {
       Image(painter = painterResource(id =R.drawable.abs  ), contentDescription ="")
           Image(painter = painterResource(id =R.drawable.aarav1 ), contentDescription ="dummy image")
   }
}
@Composable
fun TextInput(){

}