package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.BlobstoresApiService;
import io.swagger.api.factories.BlobstoresApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Blobstore;
import io.swagger.model.ErrorModel;
import io.swagger.model.NewBlobstore;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

import com.gigaspaces.manager.rest.CustomManagerResource;

@CustomManagerResource
@Path("/blobstores")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the blobstores API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-08-19T22:45:57.119Z")
public class BlobstoresApi  {
   private final BlobstoresApiService delegate;

   public BlobstoresApi() {
       this.delegate = null;
   }
   public BlobstoresApi(@Context ServletConfig servletContext) {
      BlobstoresApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("BlobstoresApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (BlobstoresApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = BlobstoresApiServiceFactory.getBlobstoresApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Deploy a new blobstore in the grid.", response = Blobstore.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "blobstore response", response = Blobstore.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Blobstore.class) })
    public Response addBlobstore(@ApiParam(value = "Blobstore to deploy" ,required=true) NewBlobstore blobstore
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addBlobstore(blobstore,securityContext);
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "deletes a single pet based on the ID supplied", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "pet deleted", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = void.class) })
    public Response deletePet(@ApiParam(value = "ID of pet to delete",required=true) @PathParam("id") Long id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deletePet(id,securityContext);
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns a specific blobstore by space name", response = Blobstore.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "pet response", response = Blobstore.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Blobstore.class) })
    public Response findBlobStoreByName(@ApiParam(value = "ID of blobstore to get",required=true) @PathParam("id") String id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.findBlobStoreByName(id,securityContext);
    }
    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns all blobstores currently deployed in the grid", response = Blobstore.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "blobstore response", response = Blobstore.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Blobstore.class, responseContainer = "List") })
    public Response findBlobstores(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.findBlobstores(securityContext);
    }
}
