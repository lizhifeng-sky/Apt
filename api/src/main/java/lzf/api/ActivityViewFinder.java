package lzf.api;

import android.app.Activity;
import android.view.View;

/**
 * Created by Administrator on 2017/5/20 0020.
 */
public class ActivityViewFinder implements ViewFinder {
    @Override
    public View findView(Object o, int id) {
        View view=((Activity)o).findViewById(id);
        return ((Activity)o).findViewById(id);
    }
}
