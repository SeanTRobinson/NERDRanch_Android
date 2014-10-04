package com.seanrobinson.bnr.todo;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MySkeletonFragment extends Fragment {

    // Called when the fragment is attached to it's parent activity
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        // Get a reference to the parent activity
    }

    // Called to do the initial creation of the fragment
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Initialise the fragment
    }

    // Called once the parent activity and the fragment's UI have been created
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // Create, or inflate, the fragments UI and return it.
        //Return null if no UI
    }

    // Called at the start of the visible lifetime
    @Override
    public void onStart() {
        super.onStart();
        // Apply any require UI change now that the fragment is visible
    }

    // Called at the start of the active lifetime
    @Override
    public void onResume() {
        super.onResume();
        // Resume any paused UI updates, threads or processes required
        // by the fragment but suspended when it became inactive
    }

    // Called at the end of the active lifetime
    @Override
    public void onPause() {
        super.onPause();
        // Suspend UI updates, threads, or CPU intensive processes
        // that don't need to be updated when the activity isn't
        // the active foreground activity.
        // Persist all edits or state changes as after this call, the
        // process is likely to be killed.
    }

    // Called at the end of the visible lifetime
    @Override
    public void onStop() {
        super.onStop();
        // Suspend any UI updates, threads, or processing
        // that aren't required when the fragment isn't visible.
    }

    // Called to save UI state changes at end of
    // visible lifetime
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Save UI state changes to the savedInstanceState.
        // This bundle will be passed to OnCreate, OnCreateView,
        // and onCreateView if the parent activity is killed and restarted.
    }

    // Called when the fragment's view has been detached
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        // Clean up resources related to view
    }

    // Called at the end of the full lifetime
    @Override
    public void onDestroy() {
        super.onDestroy();
        // Clean up resources including threads and DB connections
    }

    // Called when the fragment has been detached from it's parent activity.
    @Override
    public void onDetach() {
        super.onDetach();
    }

    // Called once the fragment has been created in order for it
    // to create it's UI
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_skeleton, container, false);
    }

}
