import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login_btn.setOnClickListener{
	var status=if(username_et.text.toString().equals(“TechWorld”) &&password_et.text.toString().equals(“password”)) “ Logged In Successfully” 
else “Login Failed
Toast.makeText(context: this, status, Toast.LENGTH_SHORT).show()
        }}
