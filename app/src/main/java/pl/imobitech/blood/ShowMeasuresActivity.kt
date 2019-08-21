package pl.imobitech.blood

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.toolbar
import kotlinx.android.synthetic.main.activity_show_measures.*
import kotlinx.coroutines.CoroutineScope
import kotlin.coroutines.CoroutineContext



//class ShowMeasuresActivity(override val coroutineContext: CoroutineContext) : AppCompatActivity() , CoroutineScope {

class ShowMeasuresActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_measures)


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        val adapter = MessuerementListAdapter(this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)


        fab2.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()

        }
    }

    }

