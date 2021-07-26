package com.flany.dsl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.flany.dsl.html.Html

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val html = Html.html {
            head {
                title {
                    "Kotlin Jetpack In Action"
                }
            }
            body {
                h1 {
                    "Kotlin Jetpack In Action"
                }
                p {
                    "A super-simple project demonstrating how to use Kotlin and Jetpack step by step."
                }
            }
        }
        findViewById<WebView>(R.id.webView).loadDataWithBaseURL(
            null,
            html,
            "text/html",
            "UTF-8",
            null
        )
    }
}