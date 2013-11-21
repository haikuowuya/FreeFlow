package org.freeflow.layouts.animations;

import org.freeflow.core.Frame;
import org.freeflow.core.FrameDescriptor;

import android.view.View;

public abstract class LayoutControllerAnimator {

	public LayoutControllerAnimator() {

	}
	
	public abstract void clear();

	public abstract void transitionToFrame(final Frame of, final FrameDescriptor nf, final View v);
	
	public abstract void start();
}