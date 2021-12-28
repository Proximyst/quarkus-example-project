package dev.mardroemmar.qep.api.request;

import java.util.OptionalInt;
import org.immutables.value.Value.Immutable;

@Immutable
public interface AbstractRandomNumberRequest {
  OptionalInt min();
  OptionalInt max();
}
