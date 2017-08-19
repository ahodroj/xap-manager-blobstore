package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Blobstore;
import io.swagger.model.ErrorModel;
import io.swagger.model.NewBlobstore;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-08-19T22:45:57.119Z")
public abstract class BlobstoresApiService {
    public abstract Response addBlobstore(NewBlobstore blobstore,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deletePet(Long id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response findBlobStoreByName(String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response findBlobstores(SecurityContext securityContext) throws NotFoundException;
}
