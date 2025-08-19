import React, { Component } from "react";

//this is a class component which we extends component from react
class AccessoriesForm extends Component {
  constructor(props) {
    super(props);

    // this is a initial state to store form values empty one
    this.state = {
      accessoryName: "",
      description: "",
      category: "",
      brand: "",
      inStock: false,
      warranty: "",
      submittedData: [] // we will  store the  submitted data here (array of objects)
    };
  }

  // Handle text, textarea, select, number input changes
  handleChange = (e) => {
    const { name, value } = e.target;
    this.setState({ [name]: value }); // Dynamically update state based on input name
  };

  // Handle radio button changes when user selects in form
  handleRadioChange = (e) => {
    this.setState({ brand: e.target.value });
  };

  // Handle checkbox 
  handleCheckboxChange = (e) => {
    this.setState({ inStock: e.target.checked });
  };

  // Handle form submission
  handleSubmit = (e) => {
// it is used to Prevent page reload because if we use action then data 
// submitted in using form will be displayed in url  
 e.preventDefault(); 
    // Collect all data into an object 
    const formData = {
      accessoryName: this.state.accessoryName,
      description: this.state.description,
      category: this.state.category,
      brand: this.state.brand,
      inStock: this.state.inStock ? "Yes" : "No",
      warranty: this.state.warranty,
    };

    // here , we will update submittedData array with new form data array 
    this.setState((prevState) => ({
      submittedData: [...prevState.submittedData, formData], // here we used spread operator to copy data form old array to new array
      accessoryName: "",
      description: "",
      category: "",
      brand: "",
      inStock: false,
      warranty: "",
    }));
  };

  render() {
    return (
      <div className="container mt-4">
        <h2 className="mb-4">Accessories Form</h2>

       
        <form onSubmit={this.handleSubmit} className="mb-4">
          {/* Text Input - Accessory Name */}
          <div className="mb-3">
            <label className="form-label">Accessory Name</label>
            <input
              type="text"
              className="form-control"
              name="accessoryName"
              value={this.state.accessoryName}
              onChange={this.handleChange}
              required
            />
          </div>

          {/* Textarea - Description */}
          <div className="mb-3">
            <label className="form-label">Description</label>
            <textarea
              className="form-control"
              name="description"
              value={this.state.description}
              onChange={this.handleChange}
              required
            />
          </div>

          {/* Select Dropdown - Category */}
          <div className="mb-3">
            <label className="form-label">Category</label>
            <select
              className="form-select"
              name="category"
              value={this.state.category}
              onChange={this.handleChange}
              required
            >
              <option value="">-- Select Category --</option>
              <option value="Mobile">Mobile</option>
              <option value="Laptop">Laptop</option>
              <option value="Headphones">Headphones</option>
              <option value="Wearables">Wearables</option>
            </select>
          </div>

          {/* Radio Buttons - Brand */}
          <div className="mb-3">
            <label className="form-label">Brand</label> <br />
            <div className="form-check form-check-inline">
              <input
                type="radio"
                name="brand"
                value="Samsung"
                checked={this.state.brand === "Samsung"}
                onChange={this.handleRadioChange}
                className="form-check-input"
              />
              <label className="form-check-label">Samsung</label>
            </div>
            <div className="form-check form-check-inline">
              <input
                type="radio"
                name="brand"
                value="Apple"
                checked={this.state.brand === "Apple"}
                onChange={this.handleRadioChange}
                className="form-check-input"
              />
              <label className="form-check-label">Apple</label>
            </div>
            <div className="form-check form-check-inline">
              <input
                type="radio"
                name="brand"
                value="Sony"
                checked={this.state.brand === "Sony"}
                onChange={this.handleRadioChange}
                className="form-check-input"
              />
              <label className="form-check-label">Sony</label>
            </div>
          </div>

          {/* Checkbox - Availability */}
          <div className="mb-3 form-check">
            <input
              type="checkbox"
              className="form-check-input"
              name="inStock"
              checked={this.state.inStock}
              onChange={this.handleCheckboxChange}
            />
            <label className="form-check-label">Available in Stock</label>
          </div>

          {/* Number Input - Warranty */}
          <div className="mb-3">
            <label className="form-label">Warranty (in years)</label>
            <input
              type="number"
              className="form-control"
              name="warranty"
              value={this.state.warranty}
              onChange={this.handleChange}
              min="0"
              required
            />
          </div>

          
          <button type="submit" className="btn btn-primary">
            Submit
          </button>
        </form>

        {/* Bootstrap Table for displaying submitted data in browser */}
        {this.state.submittedData.length > 0 && (
          <table className="table table-bordered">
            <thead className="table-dark">
              <tr>
                <th>Accessory Name</th>
                <th>Description</th>
                <th>Category</th>
                <th>Brand</th>
                <th>In Stock</th>
                <th>Warranty</th>
              </tr>
            </thead>
            <tbody>
              {this.state.submittedData.map((item, index) => (
                <tr key={index}>
                  <td>{item.accessoryName}</td>
                  <td>{item.description}</td>
                  <td>{item.category}</td>
                  <td>{item.brand}</td>
                  <td>{item.inStock}</td>
                  <td>{item.warranty} years</td>
                </tr>
              ))}
            </tbody>
          </table>
        )}
      </div>
    );
  }
}

export default AccessoriesForm;
