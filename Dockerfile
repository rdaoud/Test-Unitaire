FROM php:7.4-cli
COPY . /usr/src/myapp

WORKDIR /usr/src/myapp

RUN composer install
RUN composer require --dev phpunit/phpunit



CMD [ "php", "CalculatorTest.php" ]