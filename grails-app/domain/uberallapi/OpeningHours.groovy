package uberallapi

class OpeningHours {

    int dayOfWeek
    String from1
    String to1

    @Override
    String toString() {
        return String.format("{ dayOfWeek:%s,from1:%s,to1:%s }",dayOfWeek,from1,to1)
    }

    static constraints = {
    }
}
