package com.yuvraj.demo_webview;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    WebView simple;
    Button loadWebPage, loadFromStaticHtml;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFromStaticHtml = (Button) findViewById(R.id.load_Web_2);
        loadFromStaticHtml.setOnClickListener(this);
        loadWebPage = (Button) findViewById(R.id.load_Web_1);
        loadWebPage.setOnClickListener(this);

        simple = (WebView) findViewById(R.id.simple_webview);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.load_Web_2:
                String customHtml = "<html><body><h1>Hello, YuvrajAndroid</h1>" +
                        "<h1>Heading 1</h1><h2>Heading 2</h2><h3>Heading 3</h3>" +
                        "<p>This is a sample paragraph of static HTML In Web view</p>" +
                        "</body></html>";
                simple.loadData(customHtml, "text/html", "UTF-8");
                break;
            case R.id.load_Web_1:
                simple.setWebViewClient(new WebViewClient());
                String url = "http://yuvraj.com/ui/";
                simple.getSettings().setJavaScriptEnabled(true);
                simple.loadUrl(url);
                break;

        }
    }

    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
