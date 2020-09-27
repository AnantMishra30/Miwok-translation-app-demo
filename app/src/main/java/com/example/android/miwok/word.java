package com.example.android.miwok;

/**
 * Created by Anant Mishra on 29-05-2017.
 * here there is vocabulary word that the user wants to learn.
 * it contains the default Translation and the iwok translation.
 */

public class word {
    private String mMiwoktranslation;
    private String mDefaultTranslation;
    private int mImageResourceId=NO_IMAGE_RESOURCE;
    private int mAudioResourceId;

    private static final int NO_IMAGE_RESOURCE=-1;

    public word(String miwokWord, String defaultWord, int AudioResourceId) {
        mMiwoktranslation = miwokWord;
        mDefaultTranslation = defaultWord;
        mAudioResourceId = AudioResourceId;
    }

    public word(String miwokWord, String defaultWord, int imageResourceId, int AudioResourceId) {
        mMiwoktranslation = miwokWord;
        mDefaultTranslation = defaultWord;
        mImageResourceId = imageResourceId;
        mAudioResourceId=AudioResourceId;
    }

    public String getMiwoktranslation() {
        return mMiwoktranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId!=NO_IMAGE_RESOURCE;
    }

    public int getAudioResourceId(){
        return mAudioResourceId;
    }
}
