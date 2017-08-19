package io.swagger.api.factories;

import io.swagger.api.BlobstoresApiService;
import io.swagger.api.impl.BlobstoresApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-08-19T22:45:57.119Z")
public class BlobstoresApiServiceFactory {
    private final static BlobstoresApiService service = new BlobstoresApiServiceImpl();

    public static BlobstoresApiService getBlobstoresApi() {
        return service;
    }
}
