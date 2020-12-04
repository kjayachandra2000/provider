package com.provider;

import java.util.Random;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusCtrl {

    @RequestMapping("/bus/{station}/{nr}")
    public BusInfo bus(@PathVariable String station, @PathVariable String nr) {
        String eta = String.valueOf(getEtaBasedOnGpsAndOtherAdcancedStuff());
        BusInfo b = new BusInfo(station, nr, eta);
        return b;
    }

    private int getEtaBasedOnGpsAndOtherAdcancedStuff() {
        Random rn = new Random();
        int min = 1;
        int max = 7;
        return rn.nextInt(max - min + 1) + min;
    }
}
