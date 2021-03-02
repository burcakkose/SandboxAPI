package uberallapi

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired


@CompileStatic
class StoreLocationService {

    @Autowired
    private RestClient restClient

    List<StoreLocation> getStoreLocations() {
        final ResponseSearch result = restClient.getData()
        final List<StoreLocation> locations = result.response.locations
    }
}
