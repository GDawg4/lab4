package com.example.garoz.lab4b

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Toast
import java.net.URL

class WebActivity : AppCompatActivity() {

    /**
     * Recibe Intents de actividad pasada
     * Dependiendo de la posición que fue seleccionada, muestra proyecto acorde
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        val projectNumber = intent.getStringExtra("URL")
        val webBrowser = findViewById<WebView>(R.id.webView)
        webBrowser.canGoBack()
        Toast.makeText(this, projectNumber, Toast.LENGTH_SHORT).show()
        webBrowser.loadUrl("https://github.com/GDawg4/lab$projectNumber")
    }
}
