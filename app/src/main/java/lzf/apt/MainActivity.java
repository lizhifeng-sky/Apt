package lzf.apt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.MyClass;
import com.lighters.apt.HelloWorld;

@MyClass("lizhifeng")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HelloWorld.main(new String[]{"test"});
    }
}
