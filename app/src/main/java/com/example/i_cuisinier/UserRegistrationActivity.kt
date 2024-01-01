import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.i_cuisinier.R

class UserRegistrationActivity : AppCompatActivity() {

    private lateinit var userProfileManager: UserProfileManager

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_registration)

        userProfileManager = UserProfileManager(this)

        val registerButton: Button = findViewById(R.id.btnRegister)
        registerButton.setOnClickListener {
            registerUser()
        }
    }

    private fun registerUser() {
        val nameEditText: EditText = findViewById(R.id.editTextName)
        val emailEditText: EditText = findViewById(R.id.editTextEmail)

        val name = nameEditText.text.toString()
        val email = emailEditText.text.toString()

        userProfileManager.registerUser(name, email)

        // You can add further actions after registering the user, such as navigating to the next activity
    }
}
