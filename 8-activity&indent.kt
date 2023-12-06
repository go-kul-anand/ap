import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mStartActBtn=findViewById<Button>(R.id.startActBtn)
mStartActBtn.setOnClickListener{it:View!
//start activity intent
startActivity(Intent(packageContext:this@MainActivity,NewActivity::class.java)) 
        }}}
