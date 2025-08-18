import React from "react";
// this functinal arrow component 
const CanteenItem = ({ name, price, category, available }) => { // destructuring elements
  return (
    //here in line 10, i have used ternary opearator to check if true or false
    <div style={{ borderBottom: "1px solid gray", padding: "8px 0" }}>
      <p>
        <b>{name}</b> - Price: ₹{price} - Category: {category} -{" "}
       
        {available === "Yes" ? "Available ✅" : "Not Available ❌"}  
      </p>
    </div>
  );
};

export default CanteenItem;
