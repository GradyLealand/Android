package com.mobileapp.grady.mytube;

/**
 * Created by Grady on 2017-12-10.
 */

public class YouTubeConfig {
    private YouTubeConfig() {}

    private static final String API_KEY = "AIzaSyDr1HE0yjhIWK52TqogroMbPLSbntIxLAo";

    public static String getApiKey() {
        return API_KEY;
    }
}
