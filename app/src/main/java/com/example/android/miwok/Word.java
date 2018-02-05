package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok tranlation for that word.
 */
public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;

    /**
     * This constructor accepts two parameters, first is the Miwok word and second is the translation
     * @param mMiwokTranslation is Miwork word to be translated
     * @param mDefaultTranslation is the translation of the Miwok word
     */
    public Word(String mDefaultTranslation, String mMiwokTranslation) {
        mMiwokTranslation = mMiwokTranslation;
        mDefaultTranslation = mDefaultTranslation;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    /**
     * This method translates English word into Miwok
     * @param defaultTranslation to be translated into Miwok language
     * @return Miwok translation
     */
    public String getMiwokTranslation(String defaultTranslation) {
        if(mDefaultTranslation.toLowerCase().equals(mDefaultTranslation)) return mMiwokTranslation;
    }

    /**
     * This method tranlates Miwok word into English
     * @param miwokTranslation to be translated into English language
     * @return English translation
     */
    public String getEnglishTranslation(String miwokTranslation) {
        if(mMiwokTranslation.toLowerCase().equals(mMiwokTranslation)) return mDefaultTranslation
    }

}
