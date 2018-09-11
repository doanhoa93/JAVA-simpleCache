package com.app.simplecache.exam1;

public interface Cache {

    void add(String key, Object value, long periodInMillis);

    void remove(String key);

    Object get(String key);

    void clear();

    long size();
}