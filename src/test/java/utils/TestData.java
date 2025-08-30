package utils;

public class TestData extends RandomUtils {
    public String firstName = faker.name().firstName();
    public String lastName = faker.name().lastName();
    public String email = faker.internet().emailAddress();
    public String streetAddress = faker.address().streetAddress();
    public String phoneNumber = faker.phoneNumber().subscriberNumber(10);
    public String gender = faker.options().option("Male", "Female", "Other");
    public String dayOfBirth = String.valueOf(faker.number().numberBetween(1, 28));
    public String monthOfBirth = faker.options().option("January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December");
    public String yearOfBirth = String.valueOf(faker.number().numberBetween(1901, 2020));
    public String subjects = faker.options().option("Maths", "Arts", "Biology", "English", "Economics");
    public String hobbies = faker.options().option("Sports", "Reading", "Music");
    public String pictures = faker.options().option("testImage.jpg", "testImage2.png", "testImage3.bmp");
}
