package com.project.translate;

public class TranslateDto {
    private String text;

    public TranslateDto(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
