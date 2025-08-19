import React, { Component } from "react";

//  Controlled Component 
class FlightBookingControlled extends Component {
  constructor(props) {
    super(props);
    // state for all form fields as default thisvalues
    this.state = {
      passengerName: "",
      email: "",
      gender: "",
      mealPreference: "",
      specialRequest: "",
      submittedData: [], // stores submitted passenger data
    };
  }

  // handles changes for input fields
  handleChange = (e) => {
    const { name, value } = e.target; // get name & value from input
    this.setState({ [name]: value }); // update state dynamically
  };

  // handles form submission
  handleSubmit = (e) => {
    e.preventDefault(); // it will prevent page reload

    //this is the values taken from state
    const formData = {
      passengerName: this.state.passengerName,
      email: this.state.email,
      gender: this.state.gender,
      mealPreference: this.state.mealPreference,
      specialRequest: this.state.specialRequest,
    };

    // store data in array & reset fields
    this.setState((prevState) => ({
      submittedData: [...prevState.submittedData, formData],
      passengerName: "",
      email: "",
      gender: "",
      mealPreference: "",
      specialRequest: "",
    }));
  };

  render() {
    return (
      <div className="col-md-6">
        <h3>Controlled Flight Booking Form</h3>
        <form onSubmit={this.handleSubmit}>
          {/* Passenger Name */}
          <div className="mb-3">
            <label className="form-label">Passenger Name</label>
            <input
              type="text"
              className="form-control"
              name="passengerName"
              value={this.state.passengerName}
              onChange={this.handleChange}
              required
            />
          </div>

          {/* Email */}
          <div className="mb-3">
            <label className="form-label">Email</label>
            <input
              type="email"
              className="form-control"
              name="email"
              value={this.state.email}
              onChange={this.handleChange}
              required
            />
          </div>

          {/* Gender */}
          <div className="mb-3">
            <label className="form-label">Gender</label><br />
            <input
              type="radio"
              name="gender"
              value="Male"
              checked={this.state.gender === "Male"}
              onChange={this.handleChange}
            /> Male
            <input
              type="radio"
              name="gender"
              value="Female"
              checked={this.state.gender === "Female"}
              onChange={this.handleChange}
              className="ms-3"
            /> Female
          </div>

          {/* Meal Preference */}
          <div className="mb-3">
            <label className="form-label">Meal Preference</label>
            <select
              className="form-select"
              name="mealPreference"
              value={this.state.mealPreference}
              onChange={this.handleChange}
              required
            >
              <option value="">--Select--</option>
              <option value="Veg">Veg</option>
              <option value="Non-Veg">Non-Veg</option>
            </select>
          </div>

          {/* Special Request */}
          <div className="mb-3">
            <label className="form-label">Special Request</label>
            <textarea
              className="form-control"
              name="specialRequest"
              value={this.state.specialRequest}
              onChange={this.handleChange}
            />
          </div>

          <button type="submit" className="btn btn-primary">Submit</button>
        </form>

        {/* Submitted Data Table */}
        {this.state.submittedData.length > 0 && (
          <div className="mt-4">
            <h5>Submitted Details</h5>
            <table className="table table-bordered">
              <thead>
                <tr>
                  <th>Passenger Name</th>
                  <th>Email</th>
                  <th>Gender</th>
                  <th>Meal Preference</th>
                  <th>Special Request</th>
                </tr>
              </thead>
              <tbody>
                {this.state.submittedData.map((data, index) => ( // it used to iterate values from data
                  <tr key={index}> {/*unique keys for data */}
                    <td>{data.passengerName}</td>
                    <td>{data.email}</td>
                    <td>{data.gender}</td>
                    <td>{data.mealPreference}</td>
                    <td>{data.specialRequest}</td>
                  </tr>
                ))}
              </tbody>
            </table>
          </div>
        )}
      </div>
    );
  }
}

export default FlightBookingControlled;