import React, { useState } from "react";


function BakingItemsForm() {
  // State for form input fields (single object for all fields)
  const [form, setForm] = useState({
    itemName: "",
    quantity: "",
    ingredients: "",
    bakingTime: "",
    category: "Cake", // default category
  });

  // State to store submitted baking items here (array of objects)
  const [items, setItems] = useState([]);

  // Handle change for any input field 
  const handleChange = (e) => {
     // Destructure name and value from the event target
    const { name, value } = e.target; // get name & value from event
      // Update the state using functional form of setForm
    setForm((prevForm) => ({
      ...prevForm, // copy old values
      [name]: value, // update only changed field
    }));
  };

  // Handle form submission
  const handleSubmit = (e) => {
    e.preventDefault(); //it is used to  prevent page reload
    setItems((prevItems) => [...prevItems, form]); {/* add form data to items */}
    setForm({
      itemName: "",
      quantity: "",
      ingredients: "",
      bakingTime: "",
      category: "Cake", // reset to default
    });
  };

  return (
    <div className="container mt-5">
      {/* Card for form */}
      <div className="card shadow p-4">
        <h3 className="mb-3">🧁 Baking Items Form</h3>
        <form onSubmit={handleSubmit}>
          {/* Item Name */}
          <div className="mb-3">
            <label className="form-label">Item Name</label>
            <input
              type="text"
              name="itemName"
              value={form.itemName}
              onChange={handleChange}
              className="form-control"
              placeholder="Enter item name"
              required
            />
          </div>

          {/* Quantity */}
          <div className="mb-3">
            <label className="form-label">Quantity</label>
            <input
              type="number"
              name="quantity"
              value={form.quantity}
              onChange={handleChange}
              className="form-control"
              placeholder="Enter quantity"
              required
            />
          </div>

          {/* Ingredients */}
          <div className="mb-3">
            <label className="form-label">Ingredients</label>
            <textarea
              name="ingredients"
              value={form.ingredients}
              onChange={handleChange}
              className="form-control"
              placeholder="Enter ingredients"
              required
            />
          </div>

          {/* Baking Time */}
          <div className="mb-3">
            <label className="form-label">Baking Time (minutes)</label>
            <input
              type="number"
              name="bakingTime"
              value={form.bakingTime}
              onChange={handleChange}
              className="form-control"
              placeholder="Enter baking time"
              required
            />
          </div>

          {/* Category */}
          <div className="mb-3">
            <label className="form-label">Category</label>
            <select
              name="category"
              value={form.category}
              onChange={handleChange}
              className="form-select"
            >
              <option value="Cake">Cake</option>
              <option value="Bread">Bread</option>
              <option value="Pastry">Pastry</option>
            </select>
          </div>

          {/* Submit Button */}
          <button type="submit" className="btn btn-success">
            Add Baking Item
          </button>
        </form>
      </div>

      {/* Table to show submitted items */}
      {items.length > 0 && (
        <div className="mt-5">
          <h4>Baking Items List</h4>
          <table className="table table-bordered table-striped">
            <thead className="table-dark">
              <tr>
                <th>#</th>
                <th>Item Name</th>
                <th>Quantity</th>
                <th>Ingredients</th>
                <th>Baking Time</th>
                <th>Category</th>
              </tr>
            </thead>
            <tbody>
              {items.map((item, index) => (
                <tr key={index}>
                  <td>{index + 1}</td>
                  <td>{item.itemName}</td>
                  <td>{item.quantity}</td>
                  <td>{item.ingredients}</td>
                  <td>{item.bakingTime} mins</td>
                  <td>{item.category}</td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      )}
    </div>
  );
}

export default BakingItemsForm;
