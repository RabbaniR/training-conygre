FROM openjdk:8-alpine AS build

WORKDIR /ElizabethRaisa

COPY . .

FROM openjdk:8-alpine

WORKDIR /ElizabethRaisa

COPY --from=build /ElizabethRaisa/target/ElizabethRaisa-1.0-SNAPSHOT.jar 
.

CMD ["java", "-jar", "/ElizabethRaisa/ElizabethRaisa-1.0-SNAPSHOT.jar"]
