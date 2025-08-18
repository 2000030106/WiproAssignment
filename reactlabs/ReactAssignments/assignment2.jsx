import React, { Component } from "react";

//this is class component is created , we will extends component for car class
class Car extends Component {
  render() { // this is a react class component 
    const { brand, model, color, year } = this.props; // this destructuring using props to receive values

    return (
      <div>
        <h2>Car Details:</h2>
        <p><b>Brand:</b> {brand}</p>
        <p><b>Model:</b> {model}</p>
        <p><b>Color:</b> {color}</p>
        <p><b>Year:</b> {year}</p>
      </div>
    );
  }
}

export default Car; // this is used to import this component in another files 
