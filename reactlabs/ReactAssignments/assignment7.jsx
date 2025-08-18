import React from "react";
// Functional component with props
const Juice = ({ id, name, price }) => {//Props Destructuring
  return (
    <tr>
      <td>{id}</td>
      <td>{name}</td>
      <td>₹{price}</td>
    </tr>
  );
};

export default Juice;
