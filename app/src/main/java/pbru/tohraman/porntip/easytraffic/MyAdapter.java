package pbru.tohraman.porntip.easytraffic;

import android.content.Context;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by Lab on 8/18/2015.
 */
public class MyAdapter extends BaseAdapter{
    // let MyAdapter work as BaseAdapter >> extends
    // Explicit
    private Context objContext;     //Context is a pipeline to sent data between object
    private int[] iconInts;         //array variable to contain image
    private String[] titleStrings;  //array variable to store string

    //constructor is a method that has the same name as class >> main method

    public MyAdapter(Context objContext, int[] iconInts, String[] titleStrings) {
        // move value to variables
        this.objContext = objContext;
        this.iconInts = iconInts;
        this.titleStrings = titleStrings;
    }   // Constructor


    @Override
    public int getCount() {
        return titleStrings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {



        return null;
    }   //getView
}   // Main Class
