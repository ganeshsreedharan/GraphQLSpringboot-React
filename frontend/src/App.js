import React from "react";
import "./App.css";
import BookList from "./components/BookList";

import { ApolloProvider } from "@apollo/react-hooks";
import ApolloClient from 'apollo-boost';


const client = new ApolloClient({
  //uri: "http://localhost:8081/graphql"
  uri:"/graphql"
});

function App() {
  
  return (
    <ApolloProvider client={client}>
      <div className="App" >
        <img className="graph-img"  src="download.png" ></img>
        <h4>&nbsp;&nbsp;&nbsp;&nbsp;List Books</h4>
        <BookList ></BookList>
      </div>
    </ApolloProvider>
  );
}

export default App;
