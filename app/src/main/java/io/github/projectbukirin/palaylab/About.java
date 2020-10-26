package io.github.projectbukirin.palaylab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class About extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton3);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backActivity();
            }
        });

    TextView textView= (TextView) findViewById(R.id.link);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    public void backActivity(){
        finish();

    }
    @Override
    public void onBackPressed(){
        finish();
    }
}
