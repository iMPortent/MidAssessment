package nyc.c4q.midassessment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by MarckemX on 12/6/17.
 */

public class MyListActivity extends AppCompatActivity{

    TextView emailHolder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_list_activity);
        emailHolder = findViewById(R.id.email_holder);

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        transaction.replace(R.id.frag_holder, new RecyclerFragment());
        transaction.commit();
    }

}
