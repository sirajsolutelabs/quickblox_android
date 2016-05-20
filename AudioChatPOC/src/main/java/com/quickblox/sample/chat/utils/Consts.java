package com.quickblox.sample.chat.utils;

import com.quickblox.sample.chat.R;
import com.quickblox.sample.core.utils.ResourceUtils;

public interface Consts {
    // In GCM, the Sender ID is a project ID that you acquire from the API console
    String GCM_SENDER_ID = "29850208997";

    String QB_APP_ID = "40982";
    String QB_AUTH_KEY = "9x5m9YGYFMycrj7";
    String QB_AUTH_SECRET = "urcLs6byNpp9ybR";
    String QB_ACCOUNT_KEY = "tt86SToBJhy4HuuHBoZ2";

//    String QB_USERS_TAG = "siraj.sumra@solutelabs.com";
//    String QB_USERS_PASSWORD = "@tifa2Siraj";

    String QB_USERS_TAG = "chat";
    String QB_USERS_PASSWORD = "usertest";

    int PREFERRED_IMAGE_SIZE_PREVIEW = ResourceUtils.getDimen(R.dimen.chat_attachment_preview_size);
    int PREFERRED_IMAGE_SIZE_FULL = ResourceUtils.dpToPx(320);
}