import React, { Component } from "react";

// this is a Functional Component to display fruit list
function FruitList({ fruits }) {
  return (
    <div>
      <h3>FruitList</h3>
      <ul>
         {/*here , we iterate through the fruits array and display each fruit as a list item */}
        {fruits.map((fruit, index) => ( // it helps to identify uniquely items
          <li key={index}>{fruit}</li> 
        ))}
      </ul>
    </div>
  );
}

//this is a Class Component to manage fruit input and state
class Fruits extends Component {
  constructor(props) {
    super(props);
    this.state = {
        // Here , we have Initialized state with some default fruits and empty newFruit
      fruits: ["Apple", "Banana", "Orange"],
      //this is a controlled state for the input field.
      newFruit: ""
    };
  }

  // here , we Update newFruit state whenever user types in input box
  handleChange = (e) => {
    this.setState({ newFruit: e.target.value });
  };

    //we will  add new fruit into fruits array if input is not empty
  addFruit = () => {
    const { newFruit, fruits } = this.state;
    if (newFruit.trim() !== "") { //here , it will prevents adding blank or spaces-only fruit after user type data in input box
      this.setState({
        fruits: [...fruits, newFruit], // Spread operator adds newFruit to array
        newFruit: "" // Clear input box after adding
      });
    }
  };

  render() {
    return (
      <div>
        <h2>Fruits</h2>
        <input
          type="text"
          value={this.state.newFruit}
          onChange={this.handleChange} // this function is used to add fruit into array 
          placeholder="Enter fruit"
        />
        <button onClick={this.addFruit}>Add</button>

        {/*here it is used for  Passing fruits to functional component */}
        <FruitList fruits={this.state.fruits} />
      </div>
    );
  }
}

export default Fruits;
