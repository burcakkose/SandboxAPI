package uberallapi

import groovy.transform.CompileStatic

@CompileStatic
class StoreLocationController {

    StoreLocationService storeLocationService

        def getStoreLocations() {

        final ResponseType type = ResponseType.fromString(request.getHeader("Accept"))
        final List<StoreLocation> storeLocations = storeLocationService.getStoreLocations()

        switch (type) {
            case ResponseType.APPLICATION_JSON:
                //BUG: have problems while formatting openingHours
                render storeLocations as grails.converters.JSON
                break
            case ResponseType.TEXT_CSV:
                Converterr converter = new CSVConverter()
                String csvContent = converter.convert(storeLocations)
                response.setHeader("Content-disposition", "attachment; filename=storeLocations.csv")
                render(text: csvContent, contentType: 'text/csv', encoding: "UTF-8")
                break
            default:
                render storeLocations as grails.converters.JSON
        }
    }
}