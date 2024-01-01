import android.content.Context
import android.content.SharedPreferences
import com.example.i_cuisinier.UserProfile

class UserProfileManager(context: Context) {
    private val sharedPreferences: SharedPreferences = context.getSharedPreferences("UserProfilePrefs", Context.MODE_PRIVATE)

    companion object {
        private const val KEY_USER_NAME = "user_name"
        private const val KEY_USER_EMAIL = "user_email"
        private const val KEY_USER_PREFERENCES = "user_preferences"
    }

    fun registerUser(name: String, email: String) {
        sharedPreferences.edit().apply {
            putString(KEY_USER_NAME, name)
            putString(KEY_USER_EMAIL, email)
            apply()
        }
    }

    fun getUserProfile(): UserProfile.UserProfile {
        val name = sharedPreferences.getString(KEY_USER_NAME, "") ?: ""
        val email = sharedPreferences.getString(KEY_USER_EMAIL, "") ?: ""
        val preferences = sharedPreferences.getStringSet(KEY_USER_PREFERENCES, emptySet()) ?: emptySet()

        return UserProfile.UserProfile(name, email, preferences.toMutableSet())
    }

    fun updateUserPreferences(preferences: Set<String>) {
        sharedPreferences.edit().apply {
            putStringSet(KEY_USER_PREFERENCES, preferences)
            apply()
        }
    }
}
