import React from "react";
import { useQuery, useLazyQuery } from "@apollo/react-hooks";
import gql from "graphql-tag";

const GET_BOOKS = gql`
  query BookById($bookId: ID!) {
    bookById(id: $bookId) {
      id
      name
      pageCount
      author {
        firstName
        lastName
      }
    }
  }
`;

function BookList() {
  let bookId = "book-3";

  let [getBook, { loading, error, data }] = useLazyQuery(GET_BOOKS);

  if (loading) return "Loading...";
  if (error) return `Error! ${error.message}`;

  const handleChange = event => {
    bookId = event.target.value;
    getBook({
        variables: { bookId }
      });
  };

  const handleClick = () => {
   
  };

  return data && data.bookById ? (
    <div className="mine">
     <select onChange={handleChange}>
      <option value="-1"   disabled>select book</option>
      <option value="book-1">book-1</option>
      <option value="book-2">book-2</option>
      <option value="book-3">book-3</option>
    </select>
      <hr></hr>
      <ul id="bookList">
        <li>
          Book name : {data.bookById.name} (#{data.bookById.id})
        </li>
        <li>pageCount : {data.bookById.pageCount} </li>
        <li>
          Author Name :
          {data.bookById.author.firstName + " " + data.bookById.author.lastName}
        </li>
      </ul>
    </div>
  ) : (
    <div class="mine">
    <select onChange={handleChange}>
      <option value="-1"  selected disabled>select book</option>
      <option value="book-1">book-1</option>
      <option value="book-2">book-2</option>
      <option value="book-3">book-3</option>
    </select>
      <hr></hr>
    </div>
  );
}

export default BookList;
