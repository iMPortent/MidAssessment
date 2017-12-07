package nyc.c4q.midassessment;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView partOneScreen;
    Intent toLoginPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        partOneScreen = findViewById(R.id.part_one_screen);
        MySyncTask myTask = new MySyncTask();
        myTask.execute(90000);

        toLoginPage = new Intent(this, LoginPage.class);
    }

    private class MySyncTask extends AsyncTask<Integer, Integer, Integer> {

        int loopsCompleted = 0;

        @Override
        protected void onPreExecute(){
            loopsCompleted = 0;
        }

        @Override
        protected Integer doInBackground(Integer... integers) {
            for( int i = integers[0]; i < 100000; i++){
                loopsCompleted++;
                publishProgress(integers);
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... progress){
            partOneScreen.setText("Loops completed: " + loopsCompleted);
        }

        @Override
        protected void onPostExecute(Integer result){
            partOneScreen.setText("Loops completed: " + loopsCompleted);
        }


    }

}
