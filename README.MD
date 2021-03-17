＃　spring cloud gateway by spring-native

## environment

- [graalvm](https://github.com/graalvm/graalvm-ce-builds/releases/) installed
- [native-image](https://www.graalvm.org/reference-manual/native-image/) intalled

## build script
```shell script
mvn -Pnative-image package -Dmaven.test.skip=true
```

## idea config

[idea config](document/images/idea_config.jpg)

[idea maven config](https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/#_intellij_idea)

- Right click on spring-aot:generate then click on "After build".
- Add the JUnit configuration (or just try to run a firs time your tests) and then right click on spring-aot:test-generate then click on "Execute Run/Debug …​" then select your JUnit test configurations.

