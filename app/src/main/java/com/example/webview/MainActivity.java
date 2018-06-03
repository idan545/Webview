package com.example.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText et1;
    EditText et2;
    EditText et3;
    WebView wv1;
    Button btn1;
    TextView tv1;
    TextView tv2;
    String st1;
    String st2;
    String st3;
    Double var1;
    Double var2;
    Double var3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);


        et1 = (EditText) findViewById(R.id.et1);

        et2 = (EditText) findViewById(R.id.et2);

        et3 = (EditText) findViewById(R.id.et3);

        wv1 = (WebView) findViewById(R.id.wv1);





    }
    public void sd(View view) {


        String st1 = et1.getText().toString();
        Integer var1 = Integer.parseInt(st1);

        String st2 = et2.getText().toString();
        Integer var2 = Integer.parseInt(st2);

        String st3 = et3.getText().toString();
        Integer var3 = Integer.parseInt(st3);

        String stringUrl = "https://www.google.co.il/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#q=";
        stringUrl = stringUrl + var1 + "x%5E2%2B" + var2 + "x%2B" + var3;
        wv1.loadUrl(stringUrl);


    }
}