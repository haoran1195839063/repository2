package haoran.bwie.com.haoran20181112;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class FragmentActivity extends FragmentPagerAdapter {
    private List<Fragment> listFrag;
    private List<String> listTitle;

    public FragmentActivity(FragmentManager fm, List<Fragment> listFrag, List<String> listTitle) {
        super(fm);
        this.listFrag = listFrag;
        this.listTitle = listTitle;
    }

    @Override
    public Fragment getItem(int i) {
        return listFrag.get(i);
    }

    @Override
    public int getCount() {
        return listFrag.size();
    }

    public String title(int postion) {
        return listTitle.get(postion);
    }
}
