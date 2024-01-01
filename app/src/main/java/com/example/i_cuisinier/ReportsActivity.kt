import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.i_cuisinier.R

class ReportsActivity : AppCompatActivity() {

    private lateinit var textViewLogs: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reports)

        val btnGenerateReport: Button = findViewById(R.id.btnGenerateReport)
        textViewLogs = findViewById(R.id.textViewLogs)

        btnGenerateReport.setOnClickListener {
            generateReport()
        }
    }

    private fun generateReport() {
        // Simulate generating a report
        val report = "Cooking Report - Date: ${System.currentTimeMillis()}\n" +
                "User preferences: Vegetarian\n" +
                "Cooking history: Pasta, Salad\n" +
                "User interactions: Liked Recipe 1, Saved Recipe 2\n\n"

        // Display the report in the logs
        textViewLogs.text = report + textViewLogs.text
    }
}
