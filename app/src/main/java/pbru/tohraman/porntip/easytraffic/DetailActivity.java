package pbru.tohraman.porntip.easytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    TextView titleTextView, detailTextView;     //automatic private
    ImageView trafficImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Bind Widget
        bindWidget();

        //Show Title
        showTitle();

        //Show Image
        showImage();

        //Show Detail
        showDetail();

    }   //onCreate

    private void showDetail() {
        String[] strDetail = getResources().getStringArray(R.array.detail);
        detailTextView.setText(strDetail[getIntent().getIntExtra("Detail",0)]);

    }

    private void showImage() {
        int intImage = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        trafficImageView.setImageResource(intImage);

    }

    private void showTitle() {
        //Receive from Intent
        String strTitle = getIntent().getStringExtra("Title");
        titleTextView.setText(strTitle);
    }

    private void bindWidget() {
        titleTextView = (TextView) findViewById(R.id.txtTitleDetail);
        detailTextView = (TextView) findViewById(R.id.txtDetail);
        trafficImageView = (ImageView) findViewById(R.id.imvTrafficDetail);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_detail, menu);
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
}   //Main Class

