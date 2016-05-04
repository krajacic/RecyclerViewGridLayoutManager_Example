package cawabanga.com.recyclerviewgridlayoutmanager_example;

/**
 * Created by croatan on 3.5.2016. RecyclerViewGridLayoutManager_Example.
 */
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView imeBolesti;
    public ImageView slikaBolesti;

    public RecyclerViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        imeBolesti = (TextView)itemView.findViewById(R.id.tv_imebolesti);
        slikaBolesti = (ImageView)itemView.findViewById(R.id.iv_slikabolesti);
    }

    @Override
    public void onClick(View view) {
       // Toast.makeText(view.getContext(), "Clicked Country Position = " + getPosition(), Toast.LENGTH_SHORT).show();
    }
}