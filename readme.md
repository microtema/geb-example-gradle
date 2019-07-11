# Example Geb and Gradle Project

## Description

This is an example of incorporating Geb into a Gradle build. It shows the use of Spock, Souce-Labs and Selenium Grid.

The build is setup to work with Firefox and Chrome. Have a look at the `build.gradle` and the `src/test/resources/GebConfig.groovy` files.

## Requirements

    Java > 1.8
    Gradle 5.5 or latest
    Groovy SDK 2.5.7 or latest

## Usage

The following commands will launch the tests with the individual browsers:

    ./gradlew chromeTest
    ./gradlew firefoxTest
    ./gradlew souceLabs
    ./gradlew firefoxGrid
    ./gradlew chromeGrid

To run with all, you can run:

    ./gradlew test

Replace `./gradlew` with `gradlew.bat` in the above examples if you're on Windows.

## Souce Labs
username:   microtema
key:        ddd6304a-bc76-4f09-825e-af43063042a0

# Selenium Grid

Selenium grid is handled by dockerCompose plugin for each task that ends with *Grid

> docker-compose up
> gradle *GridTest
> docker-compose down
