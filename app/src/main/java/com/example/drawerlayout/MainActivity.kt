package com.example.drawerlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.example.drawerlayout.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply{
            
            nv.setNavigationItemSelectedListener {
                when(it.itemId){
                    R.id.item1 -> {
                        Toast.makeText(this@MainActivity, "Item 1", Toast.LENGTH_SHORT).show()
                    }
                    R.id.item2 -> {
                        Toast.makeText(this@MainActivity, "Item 2", Toast.LENGTH_SHORT).show()
                    }
                    R.id.item3 -> {
                        Toast.makeText(this@MainActivity, "Item 3", Toast.LENGTH_SHORT).show()
                    }
                    R.id.item4 -> {
                        Toast.makeText(this@MainActivity, "Item 4", Toast.LENGTH_SHORT).show()
                    }
                    R.id.item5 -> {
                        Toast.makeText(this@MainActivity, "Item 5", Toast.LENGTH_SHORT).show()
                    }
                    R.id.item6 -> {
                        Toast.makeText(this@MainActivity, "Item 6", Toast.LENGTH_SHORT).show()
                    }
                    R.id.item7 -> {
                        Toast.makeText(this@MainActivity, "Item 7", Toast.LENGTH_SHORT).show()
                    }
                    R.id.item8 -> {
                        Toast.makeText(this@MainActivity, "Item 8", Toast.LENGTH_SHORT).show()
                    }
                }

                true
            }
            
            open.setOnClickListener {
                drawer.openDrawer(GravityCompat.START)
            }
        }
    }
}