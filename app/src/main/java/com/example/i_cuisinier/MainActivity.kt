import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.i_cuisinier.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userProfileManager = UserProfileManager(this)
        val userProfile = userProfileManager.getUserProfile()

        Log.d("UserProfile", "Name: ${userProfile.name}, Email: ${userProfile.email}, Preferences: ${userProfile.preferences}")
    }
}
