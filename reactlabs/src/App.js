import logo from './logo.svg';
import './App.css';
import React from "react";

import 'bootstrap/dist/css/bootstrap.min.css';

import GroceryList from "./ReactAssignments/assignment1";
import Car from "./ReactAssignments/assignment2";
import Phone from './ReactAssignments/assignment3';
import SweetsList from './ReactAssignments/assignment4';
import Electronics from './ReactAssignments/assignment5';
import CanteenMenu from './ReactAssignments/assignment6.1';
import JuiceList from './ReactAssignments/assignment7.1';
import Restaurant from './ReactAssignments/assignment8.1';
import TempleList from './ReactAssignments/assignment9';
import TailorShop from './ReactAssignments/assignment10.1';
import TailorShop1 from './ReactAssignments/assignment10boot';
function App() {
  //assignment-1
  const groceries = ["Rice", "Wheat", "Sugar", "Milk", "Oil"];
  //assignment-2 is car
  
  //assignment-3 is phone

  //assignment-4 is sweetslist

  //assignment-5 is electronics list

  //assignment-6 canteen menu

  //assignment-7 is juicelist

  //assignment-8 restaurant menu

  //assignment-9 temple list
  return (
    <div className="App">
      
      <GroceryList items={groceries} />

      <Car brand="Toyota" model="Fortuner" color="Blue" year="2022" />

      <Phone />

      <SweetsList />

      <Electronics />

      <CanteenMenu />

      <JuiceList />

      <Restaurant />

      <TempleList />

      <TailorShop />

      <TailorShop1 />
    </div>
  );
}

export default App;
