    package com.example.garoz.lab4b

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_projects.*

    class ProjectsActivity : AppCompatActivity() {
        /**
         * Crea una nueva ListView, la llena de los laboratorios dispoibles
         * Unea adaptador
         */
    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_projects)

        listView = findViewById(R.id.projectsList)
        val projects = ArrayList<String>()
        projects.add("Laboratorio 2")
        projects.add("Laboratorio 3")
        projects.add("Laboratorio 4")
        listView.adapter = ItemAdapter(this, projects)

        listView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, WebActivity::class.java)
            intent.putExtra("URL", (position+2).toString())
            startActivity(intent)
        }
    }
}
