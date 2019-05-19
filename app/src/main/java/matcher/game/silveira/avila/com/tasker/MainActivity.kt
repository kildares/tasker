package matcher.game.silveira.avila.com.tasker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import matcher.game.silveira.avila.com.tasker.viewmodel.ItemsFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemsFragment = findViewById<FrameLayout>(R.id.fl_fragments)

    }
}
