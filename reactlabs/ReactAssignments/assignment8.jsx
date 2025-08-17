import React, { Component } from "react";

class MenuItem extends Component {
  render() {
    const { name, price, category, available } = this.props;
    return (
      <li>
        {name} - ₹{price} ({category}) -{" "}
        <strong>{available ? "Available ✅" : "Not Available ❌"}</strong>
      </li>
    );
  }
}

export default MenuItem;
