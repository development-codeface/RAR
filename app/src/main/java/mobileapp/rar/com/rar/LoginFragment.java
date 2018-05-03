package mobileapp.rar.com.rar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by irshadillias on 27/4/18.
 */

public class LoginFragment extends Fragment{
    public static String FRAGMENT_TAG = "LoginFragment";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);

    }
    public static Fragment newInstance(){
        return new LoginFragment();
    }
}
