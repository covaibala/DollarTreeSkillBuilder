# Skill Builder Instructions

## Introduction

This project will challenge your ability to write high-quality code under the pressure of applying testing frameworks that may be unfamiliar. You will get to show off your commitment to excellence, attention to detail, and tenacity.

Please follow the directions carefully and return your work as soon as you are able. The time needed to successfully complete the challenge will depend on your availability and experience. While speed is important, delivering software that is clean and easy understand is more important. I look forward to seeing your finest work.

You can reach me at jcruz@dollartree.com if you have questions or comments.

## Guidelines

* Use [Git](https://git-scm.com/), [Apache Maven](https://maven.apache.org/users/index.html), [AssertJ](https://joel-costigliola.github.io/assertj/), and [JBehave](http://jbehave.org/reference/stable/).

* The requirements are documented in three `*.story` files under the `src/test/resources` folder. The `EstimateRabbitsTest` class configures JBehave for you. It also defines constants that point to the `*.story` files. The class is setup to run `STORY_1` by default. See the [JBehave documentation](http://jbehave.org/reference/stable/parametrised-scenarios.html) to learn how to implement parameterized scenarios.

## Assignment

1. Create an empty Git repository in the project folder and add the initial commit.

2. Introduce a class that implements the `RabbitEstimator` interface with just enough code to let it compile.

3. For each `STORY_*`, in order:
    1. Add test steps to `EstimateRabbitsSteps`.
    2. Commit changes when tests FAIL successfully.
    3. Implement the feature.
    4. Commit changes when tests PASS successfully.

All three stories should run and pass as part of the build when you are done.

## Finish

1. Run `mvn clean install` and verify all tests PASS.
2. Run `mvn clean` to remove the target directory.
3. Archive the project in ZIP format.
4. Send the archive to jcruz@dollartree.com.
