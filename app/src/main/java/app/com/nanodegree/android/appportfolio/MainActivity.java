package app.com.nanodegree.android.appportfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void showToast(View view){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence toastText = "";
        switch(view.getId()){
            case R.id.btn_spotify:
                toastText="This button will launch my spotify streaming app!";
                break;
            case R.id.btn_scores:
                toastText="This button will launch my football score app!";
                break;
            case R.id.btn_library:
                toastText="This button will launch my library app!";
                break;
            case R.id.btn_bigger:
                toastText="This button will launch my build it bigger app!";
                break;
            case R.id.btn_reader:
                toastText="This button will launch my XYZ reader app!";
                break;
            case R.id.btn_capstone:
                toastText="This button will launch my capstone app!";
                break;
        }

        Toast toast = Toast.makeText(context, toastText, duration);
        
        toast.show();

    }
}
