package dev.mardroemmar.qep;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class ServiceApplication {
  public static void main(final String[] args) {
    Quarkus.run(args);
  }
}
