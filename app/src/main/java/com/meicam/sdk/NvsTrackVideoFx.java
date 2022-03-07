package com.meicam.sdk;

import android.graphics.PointF;

public class NvsTrackVideoFx extends NvsFx {
    public static final int TRACK_VIDEOFX_TYPE_BUILTIN = 0;
    public static final int TRACK_VIDEOFX_TYPE_CUSTOM = 2;
    public static final int TRACK_VIDEOFX_TYPE_PACKAGE = 1;

    private native long nativeChangeInPoint(long j, long j2);

    private native long nativeChangeOutPoint(long j, long j2);

    private native String nativeGetBuiltinTrackVideoFxName(long j);

    private native long nativeGetInPoint(long j);

    private native long nativeGetOutPoint(long j);

    private native String nativeGetTrackVideoFxPackageId(long j);

    private native int nativeGetTrackVideoFxType(long j);

    private native PointF nativeMapPointFromCanonicalToParticleSystem(long j, PointF pointF);

    private native void nativeMovePosition(long j, long j2);

    public int getTrackVideoFxType() {
        NvsUtils.checkFunctionInMainThread();
        return nativeGetTrackVideoFxType(this.m_internalObject);
    }

    public String getBuiltinTrackVideoFxName() {
        NvsUtils.checkFunctionInMainThread();
        return nativeGetBuiltinTrackVideoFxName(this.m_internalObject);
    }

    public String getTrackVideoFxPackageId() {
        NvsUtils.checkFunctionInMainThread();
        return nativeGetTrackVideoFxPackageId(this.m_internalObject);
    }

    public long getInPoint() {
        NvsUtils.checkFunctionInMainThread();
        return nativeGetInPoint(this.m_internalObject);
    }

    public long getOutPoint() {
        NvsUtils.checkFunctionInMainThread();
        return nativeGetOutPoint(this.m_internalObject);
    }

    public long changeInPoint(long j) {
        NvsUtils.checkFunctionInMainThread();
        return nativeChangeInPoint(this.m_internalObject, j);
    }

    public long changeOutPoint(long j) {
        NvsUtils.checkFunctionInMainThread();
        return nativeChangeOutPoint(this.m_internalObject, j);
    }

    public void movePosition(long j) {
        NvsUtils.checkFunctionInMainThread();
        nativeMovePosition(this.m_internalObject, j);
    }

    public PointF mapPointFromCanonicalToParticleSystem(PointF pointF) {
        NvsUtils.checkFunctionInMainThread();
        return nativeMapPointFromCanonicalToParticleSystem(this.m_internalObject, pointF);
    }
}
