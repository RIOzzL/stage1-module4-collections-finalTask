package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            boolean contains = entry.getValue().contains(developer);
            if (contains) {
                list.add(entry.getKey());
            }
        }
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return -o1.compareTo(o2);
                } else return -Integer.compare(o1.length(), o2.length());
            }
        });
        return list;
    }
}
