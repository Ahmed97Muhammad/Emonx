package com.allandroidprojects.ecomsample.utility;

import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;

import com.allandroidprojects.ecomsample.startup.MainActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by samiqureshi on 11/9/17.
 */

public class EmonXGestureListener extends GestureDetector.SimpleOnGestureListener {

    private static final String EMONX_LOG = "EmonX";


    @Override
    public boolean onDown(MotionEvent event) {
        Log.d(EMONX_LOG, "onDown: " + event.toString());

        JSONObject temp = new JSONObject();
        try {
            temp.put("Gesture", "onDown");
            temp.put("Action", MotionEvent.actionToString(event.getAction()));
            temp.put("X", (int) event.getX());
            temp.put("Y", (int) event.getY());
            temp.put("Vx", 0);
            temp.put("Vy", 0);
            temp.put("Dx", 0);
            temp.put("Dy", 0);
            temp.put("Pressure", event.getPressure());
            temp.put("EventTime", event.getEventTime());
            temp.put("DownTime", event.getDownTime());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        MainActivity.activityData.put(temp);
        return true;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        Log.d(EMONX_LOG, "onSingleTapUp: " + e.toString());
        JSONObject temp = new JSONObject();
        try {
            temp.put("Gesture", "onSingleTapUp");
            temp.put("Action", MotionEvent.actionToString(e.getAction()));
            temp.put("X", (int) e.getX());
            temp.put("Y", (int) e.getY());
            temp.put("Vx", 0);
            temp.put("Vy", 0);
            temp.put("Dx", 0);
            temp.put("Dy", 0);
            temp.put("Pressure", e.getPressure());
            temp.put("EventTime", e.getEventTime());
            temp.put("DownTime", e.getDownTime());
        } catch (JSONException ex) {
            ex.printStackTrace();
        }
        MainActivity.activityData.put(temp);
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        Log.d(EMONX_LOG, "onLongPress: " + e.toString());
        JSONObject temp = new JSONObject();
        try {
            temp.put("Gesture", "onLongPress");
            temp.put("Action", MotionEvent.actionToString(e.getAction()));
            temp.put("X", (int) e.getX());
            temp.put("Y", (int) e.getY());
            temp.put("Vx", 0);
            temp.put("Vy", 0);
            temp.put("Dx", 0);
            temp.put("Dy", 0);
            temp.put("Pressure", e.getPressure());
            temp.put("EventTime", e.getEventTime());
            temp.put("DownTime", e.getDownTime());
        } catch (JSONException ex) {
            ex.printStackTrace();
        }
        MainActivity.activityData.put(temp);
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        Log.i(EMONX_LOG, "onDoubleTap: ");
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2,
                            float distanceX, float distanceY) {
        if((e1!=null)&&(e2!=null)){
            Log.d(EMONX_LOG, "onScroll: " + e1.toString() + "\n" + "onScroll: " + e2.toString());
            JSONObject temp = new JSONObject();
            try {
                temp.put("Gesture", "onScroll1");
                temp.put("Action", MotionEvent.actionToString(e1.getAction()));
                temp.put("X", (int) e1.getX());
                temp.put("Y", (int) e1.getY());
                temp.put("Vx", 0);
                temp.put("Vy", 0);
                temp.put("Dx", distanceX);
                temp.put("Dy", distanceY);
                temp.put("Pressure", e1.getPressure());
                temp.put("EventTime", e1.getEventTime());
                temp.put("DownTime", e1.getDownTime());
                MainActivity.activityData.put(temp);
                //Clear temp
                temp = new JSONObject();
                temp.put("Gesture", "onScroll2");
                temp.put("Action", MotionEvent.actionToString(e2.getAction()));
                temp.put("X", (int) e2.getX());
                temp.put("Y", (int) e2.getY());
                temp.put("Vx", 0);
                temp.put("Vy", 0);
                temp.put("Dx", distanceX);
                temp.put("Dy", distanceY);
                temp.put("Pressure", e2.getPressure());
                temp.put("EventTime", e2.getEventTime());
                temp.put("DownTime", e2.getDownTime());
                MainActivity.activityData.put(temp);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return false;
    }

    @Override
    public boolean onFling(MotionEvent event1, MotionEvent event2,
                           float velocityX, float velocityY) {
        if((event1!=null)&&(event2!=null)){
            Log.d(EMONX_LOG, "onFling: " + event1.toString() + "\n" + "onFling: " + event2.toString());
            JSONObject temp = new JSONObject();
            try {
                temp.put("Gesture", "onFling1");
                temp.put("Action", MotionEvent.actionToString(event1.getAction()));
                temp.put("X", (int) event1.getX());
                temp.put("Y", (int) event1.getY());
                temp.put("Vx", velocityX);
                temp.put("Vy", velocityY);
                temp.put("Dx", 0);
                temp.put("Dy", 0);
                temp.put("Pressure", event1.getPressure());
                temp.put("EventTime", event1.getEventTime());
                temp.put("DownTime", event1.getDownTime());
                MainActivity.activityData.put(temp);
                //Clear temp
                temp = new JSONObject();
                temp.put("Gesture", "onFling2");
                temp.put("Action", MotionEvent.actionToString(event2.getAction()));
                temp.put("X", (int) event2.getX());
                temp.put("Y", (int) event2.getY());
                temp.put("Vx", velocityX);
                temp.put("Vy", velocityY);
                temp.put("Dx", 0);
                temp.put("Dy", 0);
                temp.put("Pressure", event2.getPressure());
                temp.put("EventTime", event2.getEventTime());
                temp.put("DownTime", event2.getDownTime());
                MainActivity.activityData.put(temp);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return false;
    }

}
