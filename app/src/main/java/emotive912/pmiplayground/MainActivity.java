package emotive912.pmiplayground;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements Serializable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] names = {"Nick", "Alex", "Jack", "Peterson"};
        String[] surnames = {"Peter", "Parker", "Jackson", "Johnson"};

        ListView lv = (ListView) findViewById(R.id.list_view);
        Random random = new Random();

        final Drawable drawable = ContextCompat.getDrawable(this, R.drawable.ic_action_name);

        final ArrayList<User> users = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            users.add(new User(names[random.nextInt(names.length)],surnames[random.nextInt(surnames.length)]));
        }

        final UserAdapter userAdapter = new UserAdapter(this, users);

        lv.setAdapter(userAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intentNew = new Intent(MainActivity.this, DetailActivity.class);
                User user = (User) userAdapter.getItem(i);
                intentNew.putExtra("user", user);
                startActivity(intentNew);
            }
        });

    }
}
