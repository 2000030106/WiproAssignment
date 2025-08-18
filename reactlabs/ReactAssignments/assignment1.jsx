import React from "react";

//this is a functional component 

function GroceryList({ items }) { //we are destructuring in this line

  const handleAddToCart = () => { // this is a event handling to handle the buttons used in javascript in browser
    alert("Groceries Added to Cart!");// this event triggered in browser for output
  };

  return (
    <div>
      <h2>Groceries List:</h2>
      <ul>
        {items.map((item, index) => ( //here we use map for dynamic rendering to get values 
          <li key={index}>{item}</li>   // here we use index to unique value to identify 
        ))}
      </ul>
      <button onClick={handleAddToCart}>Add to Cart</button>  
      
    </div>
  );
}

export default GroceryList;
