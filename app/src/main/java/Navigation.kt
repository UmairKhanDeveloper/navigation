import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val NavController= rememberNavController()
    NavHost(navController = NavController, startDestination = Screens.HomeScreen.route) {
        composable(Screens.HomeScreen.route){
            Homescreen(NavController)
        }
        composable(Screens.SceondScreen.route){
            SceondScreen(NavController)
        }
        composable(Screens.ThirdScreen.route){
            ThirdScreen(NavController)
        }
        composable(Screens.FourthScreen.route){
            FourthScreen(NavController)
        }
        composable(Screens.FiveScreen.route){
            FiveScreen(NavController)
        }

    }


}

sealed class Screens(val route:String){
    object HomeScreen:Screens("Home")
    object SceondScreen:Screens("Sceond")
    object ThirdScreen:Screens("Third")
    object FourthScreen:Screens("Fourth")
    object FiveScreen:Screens("Five")
}
