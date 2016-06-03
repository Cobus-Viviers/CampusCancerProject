package cobusviviers.campuscancerproject;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Cobus Viviers on 2016/06/01.
 */
public class ListAdapter extends ArrayAdapter {

    private final Context context;
    private final String[] names;
    private final Integer[] imageIds;

    public ListAdapter(Context context, String[] names, Integer[] imageIds) {
        super(context, R.layout.list_item_layout, names);

        this.context = context;
        this.names = names;
        this.imageIds = imageIds;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater= LayoutInflater.from(context);
        View lineView=inflater.inflate(R.layout.list_item_layout, null,true);

        TextView listText = (TextView) lineView.findViewById(R.id.listText);
        ImageView listImage = (ImageView) lineView.findViewById(R.id.listImage);

        listText.setText(names[position]);
        listImage.setImageResource(imageIds[position]);
        return lineView;

    };
}
