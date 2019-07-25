package com.example.map;

import java.util.HashMap;

public class LoggingMap<K, V> extends HashMap<K, V> {

	@Override
	public V put(K key, V value) {
		System.out.println("Put into map : " + key);
		return super.put(key, value);
	}
}
