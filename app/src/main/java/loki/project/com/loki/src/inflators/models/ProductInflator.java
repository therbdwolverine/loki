package loki.project.com.loki.src.inflators.models;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import loki.project.com.loki.R;
import loki.project.com.loki.src.inflators.InflateModelView;

/**
 * Created by User on 4/16/2017.
 */

public class ProductInflator extends InflateModelView {
    @Override
    public View inflateReadView(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.readview_layout, null);

        EditText et_ProductName = new EditText(context);
        return view;
    }
}
