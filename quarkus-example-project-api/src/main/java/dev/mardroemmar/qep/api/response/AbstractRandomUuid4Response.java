package dev.mardroemmar.qep.api.response;

import java.util.UUID;
import org.immutables.value.Value.Immutable;

@Immutable
public interface AbstractRandomUuid4Response {
  UUID uuid();
}
