package giorgi.kucia.assign2;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    ListView lv;
    Context context;


    public static int[] prgmImages = {R.drawable.earth,R.drawable.home, R.drawable.key,
            R.drawable.love, R.drawable.processor,R.drawable.radioactive,
            R.drawable.rate, R.drawable.recycle,R.drawable.server,
            R.drawable.storage, R.drawable.vector,
            R.drawable.earth,R.drawable.home, R.drawable.key,
            R.drawable.love, R.drawable.processor,R.drawable.radioactive,
            R.drawable.rate, R.drawable.recycle,R.drawable.server,
            R.drawable.storage, R.drawable.vector
    };

    public static String[] prgmNameList = {"Earth", "Home", "Key", "Love", "Processor", "Radioactive",
            "Rate", "Recycle", "Server", "Storage", "Vector",
            "Earth", "Home", "Key", "Love", "Processor", "Radioactive",
            "Rate", "Recycle", "Server", "Storage", "Vector"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;

        lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(new CustomAdapter(this, prgmNameList, prgmImages));






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
}
