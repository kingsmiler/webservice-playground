package com.test;

/**
 * This class represents a simple POJO that can be serialized/deserialized
 * as JSON or XML. It represents the Word class that is used to invoke this sample
 * application
 * <p>
 * Created by facarvalho on 12/7/15.
 */
public class Word {

    private long wordId;
    private String wordString;

    public long getWordId() {
        return wordId;
    }

    public void setWordId(long wordId) {
        this.wordId = wordId;
    }

    public String getWordString() {
        return wordString;
    }

    public void setWordString(String wordString) {
        this.wordString = wordString;
    }

}