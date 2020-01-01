# GraphQLSpringboot-React
A Sample project with Springboot + graphql + React

## Features
* Springboot backend
* React 16 with create-react-app
* Apollo Client

### React ui
![alt text](https://github.com/ganeshsreedharan/GraphQLSpringboot-React/blob/master/Helper-ui.gif)

### Graphql Console

![alt text](https://github.com/ganeshsreedharan/GraphQLSpringboot-React/blob/master/Helper-console.gif)


## Getting started

To run the final server, build the jar:
```
./gradlew build
```

and run the server:

```
java -jar build/libs/graphql-demo-0.0.1-SNAPSHOT.jar 
```
Navigate to `http://localhost:8081` to see the Employee portal.

## Development

When developing we can run server and front end seperatly
```
Start the Spring Boot Server on http://localhost:8081
./gradlew bootRun 
```
```
Start the React  development server on http://localhost:3000 
./gradlew npm_start
or
cd frontend && npm start
