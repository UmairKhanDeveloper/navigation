import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController

@Composable
fun FourthScreen(NavController: NavHostController) {
    Box (modifier = androidx.compose.ui.Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Text(text = "This is FourthScreen", modifier = androidx.compose.ui.Modifier.clickable {
            NavController.navigate(Screens.FiveScreen.route)
        }, color = Color.Green)
    }

}