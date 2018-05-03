package mobileapp.rar.com.rar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ContainerActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.container_main);
        addFragment(R.id.container,
                LoginFragment.newInstance(),
                LoginFragment.FRAGMENT_TAG);
    }
}
