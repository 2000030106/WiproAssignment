import React, { Component } from "react";
//class  React component
class MenuItem extends Component {
  render() {
    // Destructuring props (this.props)
    const { name, price, category, available } = this.props;
    return (
      <li>
        {name} - ₹{price} ({category}) -{" "}
        {/*here i have used ternary operator to check like true or false */}
        <strong>{available ? "Available ✅" : "Not Available ❌"}</strong> 
      </li>
    );
  }
}

export default MenuItem;
