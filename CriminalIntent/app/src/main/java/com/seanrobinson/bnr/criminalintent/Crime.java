package com.seanrobinson.bnr.criminalintent;

import java.util.UUID;

/**
 * Created by Sorenson on 20/09/2014.
 */
public class Crime {

    private UUID mId;
    private String mTitle;

    public UUID getmId() {
        return mId;
    }

    public String getmTitle() {

        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Crime() {
        mId = UUID.randomUUID();

    }
}
