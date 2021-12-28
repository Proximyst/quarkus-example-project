package dev.mardroemmar.qep.rest;

import dev.mardroemmar.qep.api.request.RandomNumberRequest;
import dev.mardroemmar.qep.api.response.RandomNumberResponse;
import dev.mardroemmar.qep.api.response.RandomUuid4Response;
import io.smallrye.mutiny.Uni;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/random")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface RandomApi {
  @GET
  @Path("/uuid4")
  Uni<RandomUuid4Response> randomUuid4();

  @POST
  @Path("/number")
  Uni<RandomNumberResponse> randomNumber(final RandomNumberRequest request);
}
