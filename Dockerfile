FROM openjdk:11
ADD target/Frequency-calculator-0.0.1-SNAPSHOT.jar .
CMD java -jar Frequency-calculator-0.0.1-SNAPSHOT.jar