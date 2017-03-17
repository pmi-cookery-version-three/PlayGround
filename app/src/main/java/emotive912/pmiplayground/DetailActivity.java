package emotive912.pmiplayground;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.Serializable;

public class DetailActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        TextView textView1 = (TextView)findViewById(R.id.textView);
        TextView textView2 = (TextView)findViewById(R.id.textView2);
        Intent intent = getIntent();
        User user = (User)intent.getExtras().getSerializable("user");

        textView1.setText(user.name);
        textView2.setText(user.surname);
    }
}
