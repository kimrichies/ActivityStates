package com.dev.bit.myapplication2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import static android.content.ContentValues.TAG;

/**
 * Created by kimrichies on 2/20/18.
 */

public class activityStates extends AppCompatActivity{

    // Called at the start of the full lifetime.
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Initialize activity.
        //print a log
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate");
        }

    // Called after onCreate has finished, use to restore UI state
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        // Restore UI state from the savedInstanceState.
        // This bundle has also been passed to onCreate.
        //print a log
        Log.d(TAG,"onRestore");
    }

    // Called before subsequent visible lifetimes an activity process.
    @Override
    public void onRestart(){
        super.onRestart();
        // Load changes knowing that the activity has already been visible within this process.
        //print a log
        Log.d(TAG,"onRestart");
        }

    // Called at the start of the visible lifetime.
    @Override
    public void onStart(){
        super.onStart();
        // Apply any required UI change now that the Activity is visible.
        //print a log
        Log.d(TAG,"onStart");
        }

    // Called at the start of the active lifetime.
    @Override
    public void onResume(){
        super.onResume();
        // Resume any paused UI updates, threads, or processes required by the activity but suspended when it was inactive.
        //print a log
        Log.d(TAG,"onResume");
    }

    // Called to save UI state changes at the end of the active lifecycle.
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save UI state changes to the savedInstanceState.
        // This bundle will be passed to onCreate if the process is killed and restarted.
        super.onSaveInstanceState(savedInstanceState);
        //print a log
        Log.d(TAG,"onSavedInt");
    }
    // Called at the end of the active lifetime.
    @Override
    public void onPause(){
        //Suspend UI updates, threads, or CPU intensive processes that don’t need to be updated when the Activity isn’t
        // the active foreground activity.
        super.onPause();
        //print a log
        Log.d(TAG,"onPause");
    }

    // Called at the end of the visible lifetime.
    @Override
    public void onStop(){
        // Suspend remaining UI updates, threads, or processing that aren’t required when the Activity isn’t visible.
        // Persist all edits or state changes as after this call the process is likely to be killed.
        super.onStop();
        //print a log
        Log.d(TAG,"onStop");
    }

    // Called at the end of the full lifetime.
    @Override
    public void onDestroy(){
        // Clean up any resources including ending threads, closing database connections etc.
        super.onDestroy();
        //print a log
        Log.d(TAG,"onDestroy");
    }

}
