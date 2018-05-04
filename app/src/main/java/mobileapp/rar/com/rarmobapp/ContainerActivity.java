package mobileapp.rar.com.rarmobapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ContainerActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
        replaceFragment(R.id.container,
                LoginFragment.newInstance(),
                LoginFragment.FRAGMENT_TAG,
                LoginFragment.FRAGMENT_TAG);
    }
}
