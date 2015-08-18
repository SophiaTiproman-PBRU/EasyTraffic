package pbru.tohraman.porntip.easytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {


    // Explicit delcare variable : inside Class but outside Method
    private ListView trafficListView;   // Private >> only in class can use




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Initial Widget >> link traffice listview with trafficListView variable
        initialWidget();     // Ctrl+Shift+Enter to fill in ;

    }   // Main Method

    private void initialWidget() {
        trafficListView = (ListView)findViewById(R.id.listView);  // Alt+Enter to cast data type



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
}   // Main Class
