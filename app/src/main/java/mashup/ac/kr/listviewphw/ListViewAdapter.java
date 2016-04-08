package mashup.ac.kr.listviewphw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Dong on 2016-04-08.
 */
public class ListViewAdapter extends BaseAdapter {

    ArrayList<ListItem> items;

    Context mContext;

    public ListViewAdapter(Context context) {
        super();
        mContext = context;
        items = new ArrayList<>();
    }


    public void addItem(ListItem item) {
        items.add(item);
        notifyDataSetChanged();  //리스트뷰한테 화면을 다시 그리라고 말해주는 메소드
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

        ListItemView view = null;

        //2. 성능향상
        if (convertView == null) {
            view = new ListItemView(mContext);

        } else {
            view = (ListItemView) convertView;
        }

        ListItem listItem = items.get(position);

        view.bind(listItem);

        return view;
    }


}