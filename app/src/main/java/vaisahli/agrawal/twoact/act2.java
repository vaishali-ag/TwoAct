package vaisahli.agrawal.twoact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;

public class act2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
        TextView textView = findViewById(R.id.textView);
        Intent i=getIntent();
        String s1 = i.getStringExtra("name");
        String s2 = i.getStringExtra("message");
        String  s3=String.format(Locale.ENGLISH,s1+"\n"+s2);
        textView.setText(s3);

    }
}
