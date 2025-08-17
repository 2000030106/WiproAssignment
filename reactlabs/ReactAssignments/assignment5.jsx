import React, { useState } from "react";

function Electronics() {
  const [name, setName] = useState("Laptop");
  const [brand, setBrand] = useState("Dell");
  const [price, setPrice] = useState(65000);

  const changeBrand = () => {
    setBrand("Lenovo"); 
  };

  const increasePrice = () => {
    setPrice(price + 700); 
  };

  return (
    <div style={{ textAlign: "center", marginTop: "20px" }}>
      <h2>⚡ Electronic Item Details</h2>
      <p><b>Name:</b> {name}</p>
      <p><b>Brand:</b> {brand}</p>
      <p><b>Price:</b> ₹{price}</p>
      <button 
        onClick={changeBrand} 
        style={{ 
          marginRight: "10px", 
          padding: "8px 15px", 
          backgroundColor: "#f0f0f0",
          border: "1px solid gray",
          borderRadius: "5px",
          cursor: "pointer"
        }}
      >
        Change Brand
      </button>
      <button 
        onClick={increasePrice} 
        style={{ 
          padding: "8px 15px", 
          backgroundColor: "dodgerblue", 
          color: "white",
          border: "none",
          borderRadius: "5px",
          cursor: "pointer"
        }}
      >
        Increase Price
      </button>
    </div>
  );
}

export default Electronics;
