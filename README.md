# PHPUnit Test

## Install dependencies
```
$ docker run --rm -w /home/exo -v ${%cd%}:/home/exo composer:latest install
```

## Run the test with other dependancies (load the autoload file)
```
$ docker run --rm -w /home/exo -v ${%cd%}:/home/exo php:latest ./vendor/bin/phpunit --bootstrap vendor/autoload.php tests
```

## Run the test without dependancies
```
$ docker run --rm -w /home/exo -v ${%cd%}:/home/exo php:latest ./vendor/bin/phpunit tests
```


