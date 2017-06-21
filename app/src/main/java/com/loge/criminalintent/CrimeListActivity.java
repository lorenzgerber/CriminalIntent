package com.loge.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by loge on 2017-06-14.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
