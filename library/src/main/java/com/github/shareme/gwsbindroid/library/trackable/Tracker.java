package com.github.shareme.gwsbindroid.library.trackable;

import com.github.shareme.gwsbindroid.library.utils.Action;

/**
 * Provides an interface for tracking {@link Trackable}s.
 * 
 * Calling {@link Trackable#track(Tracker, Action)} with a custom Tracker will
 * subscribe it for a notification whenever one or more {@link Trackable}s update their trackers.
 * For any call to track, only one call to {@link #update()} will occur. For a Tracker to continue
 * getting notifications, it should reissue its {@link Trackable#track()} call upon being updated.
 */
public interface Tracker {
  void update();
}
