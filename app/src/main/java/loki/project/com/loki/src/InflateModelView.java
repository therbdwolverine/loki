package loki.project.com.loki.src;

import android.content.Context;
import android.graphics.Color;
import android.widget.EditText;
import android.widget.LinearLayout;

import loki.project.com.loki.src.models.Product;

public class InflateModelView {
    public LinearLayout inflateView(Product product, Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundColor(Color.WHITE);
        linearLayout.setPadding(5, 5, 5, 5);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        EditText editText = new EditText(context);
        editText.setId();
    }

}
