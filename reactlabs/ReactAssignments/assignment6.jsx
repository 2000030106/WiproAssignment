import React from "react";

const CanteenItem = ({ name, price, category, available }) => {
  return (
    <div style={{ borderBottom: "1px solid gray", padding: "8px 0" }}>
      <p>
        <b>{name}</b> - Price: ₹{price} - Category: {category} -{" "}
        {available === "Yes" ? "Available ✅" : "Not Available ❌"}
      </p>
    </div>
  );
};

export default CanteenItem;
