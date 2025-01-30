package com.wokejanta.backend.data;

public class SearchResult {
    private int id;
    private String title;
    private String summary;
    private boolean isFake;

    // Getters and setters for all fields (id, title, summary, isFake)
    // ... (IntelliJ IDEA can generate these for you)

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public boolean isFake() {
        return isFake;
    }

    public void setFake(boolean fake) {
        isFake = fake;
    }
}

