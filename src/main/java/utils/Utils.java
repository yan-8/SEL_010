package utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Utils {
    public static String getTimestamp(String dateFormat) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String value = simpleDateFormat.format(timestamp);
        return value;
    }
}