package mobileapp.rar.com.rarmobapp;

import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;

/**
 * Created by irshadillias on 5/6/18.
 */

public class BaseFragment extends  Fragment{

    public void addFragment(@IdRes int containerViewId, Fragment fragment, FragmentManager fragmentManager, boolean shouldAddToBackStack) {
        String fragmentTag = fragment.getClass().getSimpleName();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(containerViewId, fragment, fragmentTag);
        if(shouldAddToBackStack){
            fragmentTransaction.addToBackStack(fragmentTag);
        }
        fragmentTransaction.commit();
    }

    /**
     *  Fragment
     *
     * @param containerViewId
     * @param fragment
     */
    public void replaceFragment(@IdRes int containerViewId, Fragment fragment,
            FragmentManager fragmentManager,  boolean shouldAddToBackStack) {

        String tag = fragment.getClass().getSimpleName();
        if (fragmentManager.findFragmentByTag(tag) == null) {
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            //tag
            fragmentTransaction.replace(containerViewId, fragment, tag);
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            //tag，tag
            if(shouldAddToBackStack){
                fragmentTransaction.addToBackStack(tag);
            }
            fragmentTransaction.commit();
        } else {
            // fragment，fragment
            fragmentManager.popBackStack(tag, 0);
        }
    }
}
