import React from "react";
import CanteenItem from "./assignment6";

const CanteenMenu = () => {
  return (
    <div style={{ textAlign: "center", marginTop: "20px" }}>
      <h2>Canteen Name: Sajjas Food Court</h2>
      <p><b>Location:</b>Tenali,A.P</p>
      <p><b>Open Hours:</b> 8:00 AM - 11:00 PM</p>

      <h3>Canteen Menu:</h3>

      <CanteenItem name="Idli" price={30} category="Breakfast" available="Yes" />
      <CanteenItem name="Vada" price={2} category="Snack" available="No" />
        <CanteenItem name="Dosa" price={5} category="Breakfast" available="Yes" />
      <CanteenItem name="Poori" price={40} category="Breakfast" available="Yes" />
      <CanteenItem name="Meals" price={120} category="Lunch" available="Yes" />
    </div>
  );
};

export default CanteenMenu;
