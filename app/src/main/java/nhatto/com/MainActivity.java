package nhatto.com;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private LinearLayout linearLayoutRoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initLayoutbyLinear();
        setContentView(linearLayoutRoot);
    }

    public void initLayoutbyLinear(){
        // LinearLayoutRoot
        linearLayoutRoot = new LinearLayout(this);
        LinearLayout.LayoutParams layoutParamsRoot = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        linearLayoutRoot.setOrientation(LinearLayout.VERTICAL);
        linearLayoutRoot.setLayoutParams(layoutParamsRoot);

        // LinearLayoutSecond
        LinearLayout linearLayoutSecond = new LinearLayout(this);
        LinearLayout.LayoutParams layoutParamsSecond = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        linearLayoutSecond.setOrientation(LinearLayout.HORIZONTAL);
        linearLayoutSecond.setLayoutParams(layoutParamsSecond);

        //ImageView
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        imageView.setImageResource(R.mipmap.ic_launcher);

        // TextView
        TextView tv = new TextView(this);
        LinearLayout.LayoutParams layoutParamstv = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParamstv.gravity = Gravity.CENTER;
        layoutParamstv.setMargins(20, 0, 0, 0);
        tv.setLayoutParams(layoutParamstv);
        tv.setText("Xin chào! Tôi là ngôn ngữ lập trình Android");

        linearLayoutSecond.addView(imageView);
        linearLayoutSecond.addView(tv);

        // ButtonClick
        Button btnClick = new Button(this);
        LinearLayout.LayoutParams layoutParamsbtnClick = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParamsbtnClick.gravity = Gravity.CENTER;
        btnClick.setPadding(20, 0, 0, 0);
        btnClick.setText("Click Để xem");
        btnClick.setLayoutParams(layoutParamsbtnClick);

        // ButtonHihi
        Button btnHihi = new Button(this);
        LinearLayout.LayoutParams layoutParamsbtnHihi = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParamsbtnHihi.gravity = Gravity.CENTER;
        btnHihi.setPadding(20, 0, 0, 0);
        btnHihi.setText("Hihi Đồ ngốc");
        btnHihi.setLayoutParams(layoutParamsbtnHihi);

        linearLayoutRoot.addView(linearLayoutSecond);
        linearLayoutRoot.addView(btnClick);
        linearLayoutRoot.addView(btnHihi);

    }
}
