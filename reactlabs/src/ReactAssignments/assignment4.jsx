import React from "react";

//this is a functional component
function SweetsList() {
  const sweets = [ // this is array of json objects 
    { id: 1, name: "Moti choorLaddu", price: 50 },
    { id: 2, name: "Jalebi", price: 40 },
    { id: 3, name: "Rasgulla", price: 60 },
    { id: 4, name: "Gulab Jamun", price: 70 }
  ];

  return (
    <div>
      <h2>Sweets List:</h2>
      <ul>
        {sweets.map((sweet) => ( // here map is used to iterate in array to get sweets values
        //here we will use key to unique id in list to render in data
          <li key={sweet.id}>
            {sweet.name} - Price: ₹{sweet.price}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default SweetsList;
