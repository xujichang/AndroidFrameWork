package me.xujichang.xframework.bean;

/**
 * @author xjc
 *         Created by xjc on 2017/6/7.
 */

public class FrameworkConst {
    public static final String LAUNCH_ACTIVITY_NAME = "MainActivity";
    public static final long EXIT_DURATION = 1000L;
    public static String BASE_PACKAGE_NAME;
    public static boolean USE_MAP = false;
    public static boolean USE_OFFLINE_MAP = false;

    public static class Intent {

        public static final String LOCATION_MODE = "location_mode";
    }

    public static class FLAG {
        public static final String WEB_URL = "web_url";
        public static final String LOCATION = "location";
    }

    public static class SCHEME {
        public static final String JS_SCHEME = "uniview";
        public static final String NATIVE_SCHEME = "native";
        public static final String CALL_BACK = "callback";
        public static final String HTTP_SCHEME = "http";
    }

    public static class Operation {
        public static final String START = "start";
        public static final String STOP = "stop";
    }

    public static class Url {
        public static final String[] APP_BASE_URL = new String[1];
        public static String APP_UPDATE_URL;
        public static String APP_UPDATE_PATH;
    }

    public static class PATH {
        public static final String mapPath = "/BaiduMapSDKNew/vmp";
        public static final String cmapCachePath = "/BaiduMapCache";
        public static String HTML_DIR;
    }

    public static class Fragment {
        public static final String toast = "toast";
        public static final String loading = "loading";
        public static final String dialog = "dialog";
        public static final String location = "location";
        public static final String device = "device";
        public static final String self = "self";
        public static final String activity = "activity";
    }
}
