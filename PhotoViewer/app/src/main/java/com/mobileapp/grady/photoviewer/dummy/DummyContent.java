package com.mobileapp.grady.photoviewer.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<imageItem> ITEMS = new ArrayList<imageItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, imageItem> ITEM_MAP = new HashMap<String, imageItem>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createImageItem(i));
        }
    }

    private static void addItem(imageItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static imageItem createImageItem(int position) {
        return new imageItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class imageItem {
        public final String id;
        public final String content;
        public final String path;

        public imageItem(String id, String content, String path) {
            this.id = id;
            this.content = content;
            this.path = path;

        }

        @Override
        public String toString() {
            return content;
        }
    }
}
