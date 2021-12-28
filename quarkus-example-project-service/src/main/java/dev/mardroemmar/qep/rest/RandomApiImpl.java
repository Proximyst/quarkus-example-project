package dev.mardroemmar.qep.rest;

import dev.mardroemmar.qep.api.request.RandomNumberRequest;
import dev.mardroemmar.qep.api.response.RandomNumberResponse;
import dev.mardroemmar.qep.api.response.RandomUuid4Response;
import io.smallrye.mutiny.Uni;
import java.math.BigDecimal;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Singleton;

@Singleton
@ApplicationScoped
public class RandomApiImpl implements RandomApi {
  @Override
  public Uni<RandomUuid4Response> randomUuid4() {
    return Uni.createFrom().item(() -> RandomUuid4Response.builder()
        .uuid(UUID.randomUUID())
        .build());
  }

  @Override
  public Uni<RandomNumberResponse> randomNumber(final RandomNumberRequest request) {
    return Uni.createFrom().item(() -> RandomNumberResponse.builder()
        .number(BigDecimal.valueOf(ThreadLocalRandom.current().nextLong(
            request.min().orElse(Integer.MIN_VALUE),
            request.max().orElse(Integer.MAX_VALUE)
        )))
        .build());
  }
}
