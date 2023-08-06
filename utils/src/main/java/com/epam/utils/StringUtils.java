package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String string) {
         return NumberUtils.toInt(string, -1) > 0;
    }
}
