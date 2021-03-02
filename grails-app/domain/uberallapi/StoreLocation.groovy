package uberallapi

class StoreLocation {

    String name
    String city
    String zip
    String streetAndNumber
    List<String> keywords
    List<OpeningHours> openingHours
    float lat
    float lng

    static constraints = {
    }
}
