# Ds Algo Starter
## Setup

- Install Java 16 (or the latest) on your machine.
  - Windows
    - [Install Chocolatey](https://chocolatey.org/install)
    - `choco install openjdk`
  - Mac/Linux
    - [Install SDKMAN](https://sdkman.io/install)
    - [Install your favorite JDK flavor](https://sdkman.io/jdks)
- Clone/Fork [ds-algo-starter](https://github.com/overfullstack/ds-algo-starter)
  - Run this `./gradlew clean build` in the `ds-algo-starter` root directory. It should SUCCEED.

## Practice

- Your solutions goes into folder `src/main/java/` and corresponding tests goes into `src/test/kotlin/` with same package name.
- Test First approach.
  - Start understanding the problem by thinking about test-cases that include positive tests, negative tests, corner cases etc
- Run tests using `gradle` as below

```shell
./gradlew test --tests [full-name-of-test-class]
```
For example

```shell
./gradlew test --tests leetcode.arrays.TopKFrequentWordsTest
```
### VS Code setup

_Note: Below setup can be done in your free time. Don't get blocked by this. You may start coding with your IDEs initially if this is taking time_

- Get rid of IDEs and use a text editor. Personal recommendation: [VS Code](https://code.visualstudio.com/download)
  - Setup [Java development on VS Code](https://code.visualstudio.com/docs/languages/java)
  - Install this [VS Code Extension](https://marketplace.visualstudio.com/items?itemName=fwcd.kotlin) for writing tests in Kotlin
