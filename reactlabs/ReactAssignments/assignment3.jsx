import React, { useState } from "react";

const Phone = () => {
  const [phone, setPhone] = useState({
    brand: "Samsung",
    model: "S-24 ultra",
    price: 99999,
  });

  const increasePrice = () => {
    setPhone({ ...phone, price: phone.price + 1000 }); 
  };

  return (
    <div>
      <h2>📱 Phone Details</h2>
      <p><b>Brand:</b> {phone.brand}</p>
      <p><b>Model:</b> {phone.model}</p>
      <p><b>Price:</b> ₹{phone.price}</p>
      <button 
        onClick={increasePrice} 
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
