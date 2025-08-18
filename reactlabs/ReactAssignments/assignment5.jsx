import React, { useState } from "react";

//this is functional component 
function Electronics() {
  //usestate hook is used for multiple state values
  //name,brand,price is used to store and updating component specific variables
  const [name, setName] = useState("Laptop");
  const [brand, setBrand] = useState("Dell");
  const [price, setPrice] = useState(65000);

  const changeBrand = () => { 
    setBrand("Lenovo");  // here we are doing state update for brand variable in line 8
  };

  const increasePrice = () => {
    setPrice(price + 700); // here we are doing state update for price variable in line 9
  };

  return (
    //inline styling is used to get output in correct manner in browser
    <div style={{ textAlign: "center", marginTop: "20px" }}>
      <h2>⚡ Electronic Item Details</h2>
      <p><b>Name:</b> {name}</p>
      <p><b>Brand:</b> {brand}</p>
      <p><b>Price:</b> ₹{price}</p>
      <button 
        onClick={changeBrand}  // event handling to click buttons in browser to get output
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
        onClick={increasePrice} // event handling to click buttons in browser to get output
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
