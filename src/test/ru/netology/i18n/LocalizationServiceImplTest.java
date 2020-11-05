package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

class LocalizationServiceImplTest {

    @Test
    void test_checking_returned_text() {
        // given:
        LocalizationService localizationService = new LocalizationServiceImpl();
        Country country = Country.RUSSIA;
        // when:
        String original = "Добро пожаловать";
        String result = localizationService.locale(country);
        // then:
        Assertions.assertEquals(original, result);
    }

}