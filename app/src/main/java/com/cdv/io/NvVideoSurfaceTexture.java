package com.cdv.io;

import android.graphics.SurfaceTexture;

public class NvVideoSurfaceTexture implements SurfaceTexture.OnFrameAvailableListener {
    private final int m_texId;

    private static native void notifyFrameAvailable(int i);

    public NvVideoSurfaceTexture(int i) {
        this.m_texId = i;
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        notifyFrameAvailable(this.m_texId);
    }
}
