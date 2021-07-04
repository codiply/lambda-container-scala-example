FROM mozilla/sbt as builder
COPY . /lambda/src/
WORKDIR /lambda/src/
RUN sbt assembly

FROM amazon/aws-lambda-java
COPY --from=builder /lambda/src/target/function.jar /lambda/
ENTRYPOINT [ "java", "-cp", "/lambda/function.jar", "com.amazonaws.services.lambda.runtime.api.client.AWSLambda" ]
CMD ["com.example.LambdaHandler::handleRequest"]