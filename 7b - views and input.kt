import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.time.Year
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fun onSubmit(view: View) {
            val currentYear=Calendar.getInstance().get(Calendar.YEAR)
            textView2.text="Age:"+(currentYear - editText.text.toString().toInt())
        }
        }}
