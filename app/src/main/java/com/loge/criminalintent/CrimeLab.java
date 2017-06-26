package com.loge.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by loge on 2017-06-14.
 */

public class CrimeLab {

    private static CrimeLab sCrimeLab;

    private List<Crime> mCrimeList;
    private Map<UUID, Crime> mCrimes;

    public static CrimeLab get(Context context){
        if (sCrimeLab == null){
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        mCrimes = new LinkedHashMap();
        /*
        for ( int i = 0; i < 100; i++) {
            Crime crime = new Crime();
            crime.setTitle("Crime #" + i);
            crime.setSolved(i %2 == 0);
            mCrimes.put(crime.getId(), crime);
        }*/
    }

    public void addCrime(Crime c){
        mCrimes.put(c.getId(), c);
    }

    public List<Crime> getCrimes(){
        mCrimeList = new ArrayList(mCrimes.values());
        return mCrimeList;
    }

    public Crime getCrime(UUID id) {
        return mCrimes.get(id);
    }

}
