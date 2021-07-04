# AWS Lambda Function in Scala with Container Image

In the commands below, replace `<aws-region>` and `<aws-account-number>`.

Create ECR repository

```
aws ecr create-repository --region <aws-region> --repository-name lambda-scala-example
```

Login to ECR

```
aws ecr get-login-password --region <aws-region> | docker login --username AWS --password-stdin <aws-account-number>.dkr.ecr.<aws-region>.amazonaws.com
```

Build and tag the image

```
docker build . -t <aws-account-number>.dkr.ecr.<aws-region>.amazonaws.com/lambda-scala-example
```

Push the image

```
docker push <aws-account-number>.dkr.ecr.<aws-region>.amazonaws.com/lambda-scala-example
```
