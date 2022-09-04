package com.epam.mjc.collections.combined;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new HashMap<>();
        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            Set<String> setResult = map.get(entry.getKey().length()) == null ? new TreeSet<>() : map.get(entry.getKey().length());
            setResult.add(entry.getKey());
            map.put(entry.getKey().length(), setResult);
        }
        return map;
    }
}
