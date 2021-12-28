package dev.mardroemmar.qep.api.response;

import dev.mardroemmar.qep.api.request.RandomNumberRequest;
import java.math.BigDecimal;
import org.immutables.value.Value.Immutable;

@Immutable
public interface AbstractRandomNumberResponse {
  BigDecimal number();

  RandomNumberRequest request();
}
