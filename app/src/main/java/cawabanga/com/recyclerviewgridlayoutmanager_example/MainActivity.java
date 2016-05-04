package cawabanga.com.recyclerviewgridlayoutmanager_example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private GridLayoutManager lLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(null);

       // Toolbar topToolBar = (Toolbar)findViewById(R.id.toolbar);
       // setSupportActionBar(topToolBar);
       // topToolBar.setLogo(R.drawable.logo);
       // topToolBar.setLogoDescription(getResources().getString(R.string.logo_desc));

        List<ItemObject> rowListItem = getAllItemList();
        lLayout = new GridLayoutManager(MainActivity.this, 2);

        RecyclerView rView = (RecyclerView)findViewById(R.id.recycler_view);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(MainActivity.this, rowListItem);
        rView.setAdapter(rcAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return true;
    }

    private List<ItemObject> getAllItemList(){

        List<ItemObject> allItems = new ArrayList<ItemObject>();
        allItems.add(new ItemObject("Food1", R.drawable.food1));
        allItems.add(new ItemObject("Food2", R.drawable.food2));
        allItems.add(new ItemObject("Food3", R.drawable.food3));
        allItems.add(new ItemObject("Food4", R.drawable.food4));
        allItems.add(new ItemObject("Food5", R.drawable.food5));
        allItems.add(new ItemObject("Food6", R.drawable.food6));
        allItems.add(new ItemObject("Food7", R.drawable.food7));
        allItems.add(new ItemObject("Food8", R.drawable.food8));
        allItems.add(new ItemObject("Food1", R.drawable.food1));
        allItems.add(new ItemObject("Food2", R.drawable.food2));
        allItems.add(new ItemObject("Food3", R.drawable.food3));
        allItems.add(new ItemObject("Food4", R.drawable.food4));
        allItems.add(new ItemObject("Food5", R.drawable.food5));
        allItems.add(new ItemObject("Food6", R.drawable.food6));


        return allItems;
    }
}
