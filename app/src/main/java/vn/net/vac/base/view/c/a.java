package vn.net.vac.base.view.c;

import android.app.Activity;
import android.content.Intent;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.CheckedTextView;
import android.widget.TextView;
import com.h2team.android.lichvannien.R;
import vn.net.vac.base.activity.VanKhanDetailActivity;
import vn.net.vac.base.c.g;
import vn.net.vac.base.dbmanager.model.VanKhan;

/* compiled from: ExpandableListAdapter */
public class a extends BaseExpandableListAdapter {
    private final SparseArray<b> a;
    public LayoutInflater b;
    public Activity c;

    /* compiled from: ExpandableListAdapter */
    class a implements OnClickListener {
        final /* synthetic */ VanKhan a;

        a(VanKhan vanKhan) {
            this.a = vanKhan;
        }

        public void onClick(View view) {
            Intent intent = new Intent(a.this.c, VanKhanDetailActivity.class);
            intent.putExtra("EXTRA_VAN_KHAN", this.a);
            a.this.c.startActivity(intent);
        }
    }

    public a(Activity activity, SparseArray<b> sparseArray) {
        this.c = activity;
        this.a = sparseArray;
        this.b = activity.getLayoutInflater();
    }

    public Object getChild(int i, int i2) {
        return ((b) this.a.get(i)).b.get(i2);
    }

    public long getChildId(int i, int i2) {
        return 0;
    }

    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        VanKhan vanKhan = (VanKhan) getChild(i, i2);
        if (view == null) {
            view = this.b.inflate(R.layout.expandable_list_row_details, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(R.id.text_row_title);
        g.a(this.c, 17, textView);
        textView.setText(vanKhan.a);
        view.setOnClickListener(new a(vanKhan));
        if (i2 % 2 == 0) {
            view.setBackgroundColor(-856628812);
        } else {
            view.setBackgroundColor(15786420);
        }
        return view;
    }

    public int getChildrenCount(int i) {
        return ((b) this.a.get(i)).b.size();
    }

    public Object getGroup(int i) {
        return this.a.get(i);
    }

    public int getGroupCount() {
        return this.a.size();
    }

    public long getGroupId(int i) {
        return 0;
    }

    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.inflate(R.layout.expandable_list_row_group, viewGroup, false);
        }
        CheckedTextView checkedTextView = (CheckedTextView) view;
        checkedTextView.setText(((b) getGroup(i)).a);
        checkedTextView.setChecked(z);
        g.a(this.c, 18, (TextView) view);
        return view;
    }

    public boolean hasStableIds() {
        return false;
    }

    public boolean isChildSelectable(int i, int i2) {
        return false;
    }

    public void onGroupCollapsed(int i) {
        super.onGroupCollapsed(i);
    }

    public void onGroupExpanded(int i) {
        super.onGroupExpanded(i);
    }
}
