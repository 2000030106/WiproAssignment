import React, { useState } from "react";

//this is arrow functional component 
const Phone = () => {
  const [phone, setPhone] = useState({  // this is a use state hook which are used to managing the state
    brand: "Samsung",
    model: "S-24 ultra",
    price: 99999,
  });

  const increasePrice = () => {
    setPhone({ ...phone, price: phone.price + 1000 });  // state using to update using spread operator
    //spread operator means which we copies old properties in object to new object to update any property
  };

  return (
    <div>
      <h2>📱 Phone Details</h2>
      <p><b>Brand:</b> {phone.brand}</p>
      <p><b>Model:</b> {phone.model}</p>
      <p><b>Price:</b> ₹{phone.price}</p>
      <button 
        onClick={increasePrice} //event handler used to update for this lab
        style={{
          backgroundColor: "dodgerblue",
          color: "white",
          padding: "10px 20px",
          border: "none",
          borderRadius: "5px",
          fontSize: "16px",
          cursor: "pointer"
        }}
      >
        Increase Price
      </button>
    </div>
  );
};

export default Phone;
