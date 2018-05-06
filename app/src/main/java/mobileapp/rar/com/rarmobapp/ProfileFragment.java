package mobileapp.rar.com.rarmobapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by irshadillias on 5/5/18.
 */

public class ProfileFragment extends Fragment {
    public static String FRAGMENT_TAG = "LoginFragment";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile,container,false);

    }

    public static Fragment newInstance(){
        return new ProfileFragment();
    }
}
