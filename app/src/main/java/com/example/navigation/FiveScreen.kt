import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController

@Composable
fun FiveScreen(NavController: NavHostController) {
    Box (modifier = androidx.compose.ui.Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Text(text = "This is FiveScreen", modifier = androidx.compose.ui.Modifier.clickable {
            NavController.navigate(Screens.HomeScreen.route)
        }, color = Color.Blue)
    }

}