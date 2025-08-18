import React from "react";
import Juice from "./assignment7";

//this is functional component
const JuiceList = () => {
  const juices = [ // array of json objects
    { id: 1, name: "Sapota Juice", price: 100 },
    { id: 2, name: "Watermelon Juice", price: 70 },
    { id: 3, name: "Mango Juice", price: 120 }
  ];

  return (
    //here we used inline styling for div and table
    <div style={{ textAlign: "center", marginTop: "20px" }}>
      <h2>🥤 Juice Menu</h2>
      {/* here i have used table to display values in browser*/}
      <table border="1" align="center" cellPadding="10">
        <thead>
          <tr>
            {/*Component Injection*/}
            <th>ID</th>
            <th>Juice Name</th>
            <th>Price</th>
          </tr>
        </thead>
        <tbody>
          {juices.map((juice) => ( // Iterates over juices array to render rows
            <Juice key={juice.id} id={juice.id} name={juice.name} price={juice.price} />
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default JuiceList;
