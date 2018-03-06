package com.imooc.config.datasource;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DataSourceContextHolder {
    private static final ThreadLocal<String> holder = new ThreadLocal<>();

    public static void setDataSource(String type) {
        holder.set(type);
    }

    public static String getDataSource() {
        String lookUpKey = holder.get();
        return lookUpKey == null ? "masterDataSource" : lookUpKey;
    }

    public static void clear() {
        holder.remove();
    }
}
