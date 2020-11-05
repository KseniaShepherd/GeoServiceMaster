package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

class GeoServiceImplTest {
    @Test
    void test_determining_location_by_ip() {
        // given:
        String MOSCOW_IP = "172.0.32.11";
        Location original = new Location("Moscow", Country.RUSSIA, "Lenina", 15);
        final GeoService geoService = new GeoServiceImpl();
        // when:
        Location result = geoService.byIp(MOSCOW_IP);
        // then:
      Assertions.assertEquals(original, result);
    }


}