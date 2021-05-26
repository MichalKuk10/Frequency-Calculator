FROM openjdk:11
ADD target/Frequecy-calculator.jar .
CMD java -jar Frequecy-calculator.jar