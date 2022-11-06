package com.example.lib_network.response.listener;

/**
 * @author vision
 */
public class DisposeDataHandle {

    public Class<?> mClass = null;
    public DisposeDataListener mListener = null;
    public String mSource = null; // 文件保存路径

    public DisposeDataHandle(DisposeDataListener listener) {
        this.mListener = listener;
    }

    public DisposeDataHandle(DisposeDataListener listener, Class<?> clazz) {
        this.mListener = listener;
        this.mClass = clazz;
    }

    public DisposeDataHandle(DisposeDataListener listener, String source) {
        this.mListener = listener;
        this.mSource = source;
    }
}