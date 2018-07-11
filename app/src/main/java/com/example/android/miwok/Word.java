package com.example.android.miwok;

import android.content.Context;

/**
 * Created by ayasfn on 7/28/2017.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;

    // Costructor
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    // Methods
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }


}
