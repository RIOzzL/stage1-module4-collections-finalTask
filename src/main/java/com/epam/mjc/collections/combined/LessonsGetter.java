package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> result = new HashSet<>();
        Collection<List<String>> values = timetable.values();
        for (List<String> value : values) {
            for (String s : value) {
                result.add(s);
            }
        }
        return result;
    }
}
