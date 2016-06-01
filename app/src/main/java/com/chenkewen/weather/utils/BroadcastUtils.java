package com.chenkewen.weather.utils;

import android.content.Context;
import android.content.Intent;

import com.chenkewen.weather.activity.HomeActivity;
import com.chenkewen.weather.services.DeskWidget41Service;
import com.chenkewen.weather.services.NotificationService;

public class BroadcastUtils {

    public static void sendUpdateWidgetWeatherBroadcast(Context context) {
        context.sendBroadcast(new Intent(DeskWidget41Service.ACTION_UPDATE_WIDGET_WEATHER));
    }

    public static void sendUpdateWidgetTextColorBroadcast(Context context) {
        context.sendBroadcast(new Intent(DeskWidget41Service.ACTION_UPDATE_WIDGET_TEXT_COLOR));
    }

    public static void sendNotificationBroadcast(Context context) {
        context.sendBroadcast(new Intent(NotificationService.ACTION_SHOW_NOTICATION));
    }

    public static void sendShowHomeDataBroadcast(Context context) {
        context.sendBroadcast(new Intent(HomeActivity.ACTION_SHOWDATA));
    }

    public static void sendSetWidgetClickListenerBroadcast(Context context) {
        context.sendBroadcast(new Intent(DeskWidget41Service.ACTION_SET_WIDGET_CLICK_LISTENER));
    }

}
