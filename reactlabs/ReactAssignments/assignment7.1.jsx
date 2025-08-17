import React from "react";
import Juice from "./assignment7";

const JuiceList = () => {
  const juices = [
    { id: 1, name: "Sapota Juice", price: 100 },
    { id: 2, name: "Watermelon Juice", price: 70 },
    { id: 3, name: "Mango Juice", price: 120 }
  ];

  return (
    <div style={{ textAlign: "center", marginTop: "20px" }}>
      <h2>🥤 Juice Menu</h2>
      <table border="1" align="center" cellPadding="10">
        <thead>
          <tr>
            <th>ID</th>
            <th>Juice Name</th>
            <th>Price</th>
          </tr>
        </thead>
        <tbody>
          {juices.map((juice) => (
            <Juice key={juice.id} id={juice.id} name={juice.name} price={juice.price} />
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default JuiceList;
