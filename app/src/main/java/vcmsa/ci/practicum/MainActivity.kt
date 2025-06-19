package vcmsa.ci.practicum

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //This is the Buttons
        val firstButton = findViewById<Button>(R.id.btnFirst)
        val secondButton = findViewById<Button>(R.id.btnSecond)
        //Author:Ashrika Maharaj
        //url:https://AM-spec577.com

        //This is the first Button
        firstButton.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("playlist", "My Favourite Songs")
            startActivity(intent)
            //Author:Ashrika Maharaj
            //url:https://AM-spec577.com
        }

        //This is the second Button
        secondButton.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("playlist", "Workout Mix")
            startActivity(intent)
            //Author:Ashrika Maharaj
            //url:https://AM-spec577.com
        }
    }
}