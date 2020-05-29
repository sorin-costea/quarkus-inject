package org.sorincos;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.inject.Named;

@Named("test")
public class TestLambda implements RequestHandler<InputObject, OutputObject> {

  private final static Logger LOGGER = Logger.getLogger(TestLambda.class.getName());

  @Inject
  ProcessingService service;

  @Override
  public OutputObject handleRequest(InputObject input, Context context) {
    LOGGER.fine("FINE");
    LOGGER.info("service is: " + service);
    LOGGER.warning("WARN");
    LOGGER.severe("SEV");
    return service.process(input).setRequestId(context.getAwsRequestId());
  }
}
