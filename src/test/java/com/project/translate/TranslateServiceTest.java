package com.project.translate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TranslateServiceTest {

    @Autowired
    private TranslateService translateService;

    TranslateDto translationDto = new TranslateDto("hello");

    @Test
    public void translate() {
        // Act: Realiza la traducción
        String translatedText = translateService.translate(translationDto.getText());

        // Assert: Verifica que el texto se traduzca correctamente
        assertThat(translatedText).isEqualTo("hola");
    }

    @Test
    public void translateUnknownText() {
        TranslateDto unknownTranslationDto = new TranslateDto("unknown");

        String translatedText = translateService.translate(unknownTranslationDto.getText());

        assertThat(translatedText).isEqualTo("traducción no encontrada");
    }
}