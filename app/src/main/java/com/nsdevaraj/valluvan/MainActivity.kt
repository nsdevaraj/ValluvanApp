package com.nsdevaraj.valluvan

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.nsdevaraj.valluvan.ui.theme.ValluvanTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main) // Set the content view to the layout with WebView

        val webView: WebView = findViewById(R.id.webview)
        webView.settings.javaScriptEnabled = true // Enable JavaScript if needed
        webView.webViewClient = WebViewClient() // Ensure WebViewClient is set

        // Clear cache
       // webView.clearCache(true)

        // Disable cache
       // webView.settings.cacheMode = WebSettings.LOAD_NO_CACHE // Corrected line

        webView.loadUrl("https://valluvan.netlify.app/") // Load the specified URL
    }
}
