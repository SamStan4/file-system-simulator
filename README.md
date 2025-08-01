# file-system-simulator

## Commands N' Stuff

### Building the project

```bash
mvn compile
```

### Executing the Project (make sure to build first)

```bash
mvn exec:java -Dexec.mainClass="com.samstanley.App"
```

### Cleaning the Project

```bash
mvn clean
```

### Maven Generation

```bash
mvn archetype:generate \
  -DgroupId=com.samstanley \
  -DartifactId=file-system-simulator \
  -DarchetypeGroupId=org.apache.maven.archetypes \
  -DarchetypeArtifactId=maven-archetype-simple \
  -DarchetypeVersion=1.5
```
