package com.example.sampleprojectarchitecture.util.constants;

/**
 * Created by Darshan Patel 24/02/2020
 * Usage: list down all application constants here
 * How to call: call through class name and variable as all variable inside this class would be static
 */
public class Constants {
    public static final String CRASHLYTICS_KEY_PRIORITY = "priority";
    public static final String CRASHLYTICS_KEY_TAG = "tag";
    public static final String CRASHLYTICS_KEY_MESSAGE = "message";

    // Retrofit file cache name
    public static String retrofitCacheFile = "investerServiceCacheFile";

    public interface ApiEndpoints {
        String MAIN_API = "6c3je";
    }

    public interface ApiFields {
        String CONTENT_TYPE = "application";
    }
}
