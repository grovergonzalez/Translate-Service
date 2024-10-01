package com.project.translate;

import java.util.HashMap;
import java.util.Map;

public class TranslateService {
    private final Map<String, String> translations = new HashMap<>();

    public TranslateService() {
        // Se pueden agregar algunas traducciones predefinidas
        translations.put("hello", "hola");
        translations.put("world", "mundo");
    }

    public String translate(String text) {
        return translations.getOrDefault(text.toLowerCase(), "traducción no encontrada");
    }
}
