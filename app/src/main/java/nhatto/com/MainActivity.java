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
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private LinearLayout linearLayoutRoot;
    private RelativeLayout relativeLayoutRoot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        initLayoutbyLinear();
        initLayoutbyRelative();
        setContentView(relativeLayoutRoot);
    }

    public void initLayoutbyRelative(){
        //RelativeLayoutRoot
        relativeLayoutRoot = new RelativeLayout(this);

        //RelativeLayoutSecond
        RelativeLayout relativeLayoutSecond = new RelativeLayout(this);
        RelativeLayout.LayoutParams reLayoutParamsScond = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        relativeLayoutSecond.setId(R.id.rl);

        //ImageView
        ImageView imgAvatar = new ImageView(this);
        imgAvatar.setLayoutParams(new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        imgAvatar.setId(R.id.imgAvatar);
        imgAvatar.setImageResource(R.mipmap.ic_launcher);

        //TextView
        TextView tv = new TextView(this);
        RelativeLayout.LayoutParams layoutParamsTv = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParamsTv.addRule(RelativeLayout.CENTER_VERTICAL);
        layoutParamsTv.setMargins(20,0,0,0);
        layoutParamsTv.addRule(RelativeLayout.RIGHT_OF,imgAvatar.getId());
        tv.setText(getString(R.string.sologan));
        tv.setLayoutParams(layoutParamsTv);

        relativeLayoutSecond.addView(imgAvatar);
        relativeLayoutSecond.addView(tv);

        //ButtonClick
        Button btnClick = new Button(this);
        RelativeLayout.LayoutParams layoutParamsbtnClick = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParamsbtnClick.addRule(RelativeLayout.BELOW,relativeLayoutSecond.getId());
        layoutParamsbtnClick.addRule(RelativeLayout.CENTER_HORIZONTAL);
        btnClick.setPadding(10,10,10,10);
        btnClick.setText(getString(R.string.btnClick));

        //ButtonHihi
        Button btnHihi = new Button(this);
        RelativeLayout.LayoutParams layoutParamsbtnHihi = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParamsbtnHihi.addRule(RelativeLayout.BELOW,relativeLayoutSecond.getId());
        layoutParamsbtnHihi.addRule(RelativeLayout.CENTER_HORIZONTAL);
        btnHihi.setText(getString(R.string.btnHihi));

        linearLayoutRoot.addView(relativeLayoutSecond,reLayoutParamsScond);
        linearLayoutRoot.addView(btnClick,layoutParamsbtnClick);
        linearLayoutRoot.addView(btnHihi,layoutParamsbtnHihi);
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
