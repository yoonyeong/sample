package mashup.ac.kr.listviewphw;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by Dong on 2016-04-08.
 */
public class ListViewAdaptorextends extends BaseAdapter {

    ArrayList items = new ArrayList();

    public void addItem(ListItem item) {
        items.add(item);
    }

    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //TextView view = new TextView(getApplicationContext());

        // ListItemView view = new ListItemView(getApplicationContext());
        //view.setName(name[position]);
        //view.setPhone(phone[position]);

        //return view;
        //}
        ListItemView view = null;

        if (convertView == null) {
            view = new ListItemView(getApplicationContext());
        } else {
            view = (ListItemView) convertView;
        }
        return view;
    }


}