package uberallapi

import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVPrinter

class CSVConverter implements Converterr {

    @Override
    def convert(List<StoreLocation> locations) {
        def results = []
        results << ["Name","City","Zip","streetAndNumber","Keywords","Opening Hours","Lat","Lng"]

        for(loc in locations) {
            def result = [loc.name, loc.city,loc.zip,loc.streetAndNumber,loc.keywords.join(","),loc.openingHours.toString(),loc.lat,loc.lng]
            results << result
        }
        StringWriter stringWriter = new StringWriter();
        CSVPrinter printer = new CSVPrinter(stringWriter, CSVFormat.EXCEL);
        printer.printRecords(results)
        printer.flush()
        printer.close()
        return stringWriter.toString()
    }

    static constraints = {
    }
}
