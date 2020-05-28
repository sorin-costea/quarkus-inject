package org.sorincos;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

import java.util.logging.Logger;

@QuarkusMain
public class TestMain {
  private final static Logger LOGGER = Logger.getLogger(TestLambda.class.getName());

  // basically just to keep the IDE happy
  public static void main(String... args) {
    LOGGER.fine("FINE");
    LOGGER.info("INFO");
    LOGGER.warning("WARN");
    LOGGER.severe("SEV");
    Quarkus.run(args);
  }
}
