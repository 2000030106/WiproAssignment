import React, { Component } from "react";

// this is a Functional Component to display television models
function TelevisionList({ models }) {
  return (
    <div>
      <h3>Television Models</h3>
      <ul>
        {/*here it iterates  through models array and display each model */}
        {models.map((model, index) => (
          <li key={index}>{model}</li>
        ))}
      </ul>
    </div>
  );
}

// Class Component to manage television models
class TelevisionManager extends Component {
  constructor(props) {
    super(props);
    // Initial state with some models and empty input
    this.state = {
      models: ["Samsung QLED", "LG OLED", "Sony Bravia"],
      newModel: ""
    };
  }

  // here we will Update input value in state whenever user types
  handleChange = (e) => {
    this.setState({ newModel: e.target.value });
  };

  // Add new model to models array using spread operator
  addModel = () => {
    const { newModel, models } = this.state;
    if (newModel !== "") { // it is used to prevent empty entries
      this.setState({
        models: [...models, newModel], // here we use spread operator to  adds items fro old array to  new array  item and it uses to reduce code
        newModel: "" // clear input after adding
      });
    }
  };

  render() {
    return (
      <div>
        <h2>Television Manager</h2>
        
        <input
          type="text"
          value={this.state.newModel}
          onChange={this.handleChange}
          placeholder="Enter television model"
        />

        {/* Button to add new model */}
        <button onClick={this.addModel}>Add</button>

        {/* Pass models as props to functional component */}
        <TelevisionList models={this.state.models} />
      </div>
    );
  }
}

export default TelevisionManager;
