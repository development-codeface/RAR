package mobileapp.rar.com.rarmobapp;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by irshadillias on 27/4/18.
 */

public abstract class BaseActivity extends AppCompatActivity {

    protected void addFragment(int containerViewId,
                                Fragment fragment,
                                String fragmentTag) {
        getSupportFragmentManager()
                .beginTransaction()
                .add(containerViewId, fragment, fragmentTag)
                .disallowAddToBackStack()
                .commit();
    }

    protected void replaceFragment( int containerViewId,
                                    Fragment fragment,
                                    String fragmentTag,
                                    String backStackStateName) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(containerViewId, fragment, fragmentTag)
                .addToBackStack(backStackStateName)
                .commit();
    }

}