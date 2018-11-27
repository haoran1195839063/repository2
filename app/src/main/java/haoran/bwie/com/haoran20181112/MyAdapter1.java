package haoran.bwie.com.haoran20181112;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class MyAdapter1 extends BaseAdapter {
    private Context mContext;
    private List<String> list;

    public MyAdapter1(Context mContext, List<String> list) {
        this.mContext = mContext;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewholder = null;
        if (convertView == null) {
            viewholder = new ViewHolder();
            convertView = View.inflate(mContext, R.layout.geshi1, null);
            viewholder.text = convertView.findViewById(R.id.textgeshi);
            convertView.setTag(viewholder);
        }else {
            viewholder= (ViewHolder) convertView.getTag();
        }
        viewholder.text.setText(list.get(position));
        return convertView;
    }

    class ViewHolder {
        TextView text;
    }
}
