package lzf.apt;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.LzfBindView;

import lzf.api.LzfViewBinder;


public class MainActivity extends AppCompatActivity {
    @LzfBindView(R.id.myText)
    TextView myTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LzfViewBinder.bind(this);
        myTextView.setText("测试");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LzfViewBinder.unBind(this);
    }
}
