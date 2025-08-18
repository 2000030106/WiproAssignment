import React, { Component } from "react";
import MenuItem from "./assignment8";

//this is class component extends component
class Restaurant extends Component {
  render() { // this is used t return jsx in class components
    return (
      <div style={{ padding: "20px", fontFamily: "Arial" }}>
        {/* Component composition*/}
        <h1>Restaurant Name: SaSi Delicious</h1>
        <p><b>Location:</b> Tenali,A.P</p>
        <p><b>Open Hours:</b> 9:00 AM - 11:00 PM</p>

        <h2>Restaurant Menu:</h2>
        <ul>
        {/* we are getting props from another coponent from parent part */}
        {/* child component is reused multiple times with different values.*/}
          <MenuItem name="Paneer Biryani" price={150} category="Main Course" available={true} />
          <MenuItem name="Onion Dosa" price={80} category="Breakfast" available={true} />
          <MenuItem name="Gulab Jamun" price={40} category="Dessert" available={true} />
            <MenuItem name="Chicken Biryani" price={200} category="Main Course" available={true} />
          <MenuItem name="Veg Thali" price={120} category="Combo" available={false} />
        </ul>
      </div>
    );
  }
}

export default Restaurant;
