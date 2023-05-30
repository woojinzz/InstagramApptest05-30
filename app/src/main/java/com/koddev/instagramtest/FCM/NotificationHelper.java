package com.koddev.instagramtest.FCM;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;

public class NotificationHelper {

    private static final String PRIMARY_CHANNEL_ID = "primary_notification_channel";
    private NotificationManager mNotificationManager;
    private Context mContext;

    public NotificationHelper(Context context) {
        mContext = context;
        createNotificationChannel();
    }

    private void createNotificationChannel() {
        // Android 8.0(Oreo) 이상에서는 채널 생성해야 함
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            // Notification Manager 생성
            mNotificationManager = (NotificationManager) mContext.getSystemService(Context.NOTIFICATION_SERVICE);

            // Notification Channel 생성
            NotificationChannel notificationChannel = new NotificationChannel(PRIMARY_CHANNEL_ID,
                    "Instagram Clone", NotificationManager.IMPORTANCE_HIGH);

            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(Color.RED);
            notificationChannel.enableVibration(true);
            notificationChannel.setDescription("Notification from Instagram Clone");

            // Notification Channel 등록
            mNotificationManager.createNotificationChannel(notificationChannel);
        }
    }
}
