package vcmsa.ci.practicum

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

        //The playlistName and textView
        val playlistName = intent.getStringExtra("playlist")
        val textView = findViewById<TextView>(R.id.textViewPlaylist)
        textView.text = "Playlist: $playlistName"
        //Author:Ashrika Maharaj
        //url:https://AM-spec577.com
    }
}