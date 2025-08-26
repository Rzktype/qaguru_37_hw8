package utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class RandomUtils {

    static Faker faker = new Faker(new Locale("en-GB"));

    public String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            streetAddress = faker.address().streetAddress(),
            phoneNumber = faker.phoneNumber().subscriberNumber(10),
            gender = faker.options().option("Male", "Female", "Other"),
            dayOfBirth = String.valueOf(faker.number().numberBetween(1, 28)),
            monthOfBirth = faker.options().option("January", "February", "March", "April", "May", "June",
                    "July", "August", "September", "October", "November", "December"),
            yearOfBirth = String.valueOf(faker.number().numberBetween(1901, 2020)),
            subjects = faker.options().option("Maths", "Arts", "Biology", "English", "Economics"),
            hobbies = faker.options().option("Sports", "Reading", "Music"),
            pictures = faker.options().option("testImage.jpg", "testImage2.png", "testImage3.bmp");
    public String state = getState(), city = getCity(state);


    public static String getState() {
        return faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
    }

    public static String getCity(String state) {
        return switch (state) {
            case "NCR" -> faker.options().option("Delhi", "Gurgaon", "Noida");
            case "Uttar Pradesh" -> faker.options().option("Agra", "Lucknow", "Merrut");
            case "Haryana" -> faker.options().option("Karnal", "Panipat");
            case "Rajasthan" -> faker.options().option("Jaipur", "Jaiselmer");
            default -> null;
        };


    }
}
