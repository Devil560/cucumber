FROM    maven:3.6.3-jdk-8
RUN     mkdir /Smartbear
WORKDIR /Smartbear
COPY    . .
RUN ls
CMD mvn clean test -Dcucumber.options="--tags '@testall and @smoketest'" 