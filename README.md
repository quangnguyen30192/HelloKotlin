### How to run a kotlin file

#### Install java and kotlin
```bash
brew install java
brew install kotlin
```

#### Run a kotlin file
Compile a kotlin file into a jar file
```bash
kotlinc Hello.kt -include-runtime -d Hello.jar
```

Run the jar file by java
```bash
java -jar Hello.jar
```
