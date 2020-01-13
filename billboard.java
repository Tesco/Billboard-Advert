Company tesco = Company.CompanyBuilder()
    .setName("Tesco Technology")
    .setLocation("Welwyn Garden City")
    .setCareerOpportunities(List.of(
        "Software Development Engineer",
        "Data Scientist",
        "Product Manager"
    ))
    .setScale(Scale.ScaleBuilder()
        .setShoppingTripsPerWeek(80_000_000)
        .setNumberOfCountries(10)
        .setNumberOfShops(6800)
        .build()
    )
    .build();

if (you.canReadThis() && tesco.getCareerOpportunities().contains(you.getCareer()) &&
    you.emailSent("https://www.tesco-careers.com/technology") && applicationSuccessful()) {
    you.receiveBenefits(List.of(
        "10% colleague discount",
        "Retirement savings plan",
        "Annual bonus scheme",
        "Cycle to work & car share schemes",
        "Fantastic campus, with gym and football pitch"
    ));
}
