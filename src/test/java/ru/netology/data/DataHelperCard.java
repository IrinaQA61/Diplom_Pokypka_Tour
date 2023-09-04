package ru.netology.data;

import lombok.Value;


@Value

public class DataHelperCard {
    private static String month = "08";
    private static String year = "31";
    private static String owner = "Ivan Ivalik";
    private static String cvc = "666";
    private static String approvedCardNumber = "4444444444444441";
    private static String declinedCardNumber = "4444444444444442";

    public static String getMonth() {
        return month;
    }

    public static String getYear() {
        return year;
    }

    public static String getOwner() {
        return owner;
    }

    public static String getCvc() {
        return cvc;
    }

    public static String getApprovedCardNumber() {
        return approvedCardNumber;
    }

    public static String getDeclinedCardNumber() {
        return declinedCardNumber;
    }
}
