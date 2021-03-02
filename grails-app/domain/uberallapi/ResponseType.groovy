package uberallapi

enum ResponseType {

    APPLICATION_JSON("application/json"),
    TEXT_CSV("text/csv");

    private String responseType

    String getResponseType() {
        return this.responseType
    }

    private ResponseType(String responseType) {
        this.responseType = responseType
    }

    static ResponseType fromString(String responseType) {
        for(ResponseType r : ResponseType.values()) {
            if(responseType != null) {
                return r
            }
        }
        return null;
    }
}
