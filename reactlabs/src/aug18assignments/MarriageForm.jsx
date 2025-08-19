import React, { Component } from "react";

// this is a Class Component
class MarriageForm extends Component {
  constructor(props) {
    super(props);
    // here , we use state to store form input values and submission flag
    this.state = {
      brideName: "",
      groomName: "",
      date: "",
      venue: "",
      submitted: false // Will be true after clicking submit
    };
  }

  // Handle input  box to change (it will updates state for each field present in the form)
  handleChange = (e) => {
    // e.target.name refers to input's name attribute present in form
    // e.target.value is the value entered by user from user
    this.setState({ [e.target.name]: e.target.value });
  };

  // Handle form submit
  handleSubmit = (e) => {
    e.preventDefault(); // Prevents page reload
    this.setState({ submitted: true }); // Set flag to true so details are displayed
  };

  render() {
    // Destructure values from state
    const { brideName, groomName, date, venue, submitted } = this.state;

    return (
      <div className="container mt-5">
        {/* Form Card */}
        <div className="card p-4 shadow">
          <h2 className="text-center mb-4">Marriage Form</h2>
          
         
          <form onSubmit={this.handleSubmit}>
            
            {/* Bride Name Input box */}
            <div className="form-group mb-3">
              <label>Bride Name</label>
              <input
                type="text"
                className="form-control"
                name="brideName"        
                value={brideName}        
                onChange={this.handleChange} // updates state on typing in input box
                required
              />
            </div>

            {/* Groom Name Input box */}
            <div className="form-group mb-3">
              <label>Groom Name</label>
              <input
                type="text"
                className="form-control"
                name="groomName"
                value={groomName}
                onChange={this.handleChange}
                required
              />
            </div>

            {/* Marriage Date Input box */}
            <div className="form-group mb-3">
              <label>Marriage Date</label>
              <input
                type="date"
                className="form-control"
                name="date"
                value={date}
                onChange={this.handleChange}
                required
              />
            </div>

            {/* Venue Input box */}
            <div className="form-group mb-3">
              <label>Venue</label>
              <input
                type="text"
                className="form-control"
                name="venue"
                value={venue}
                onChange={this.handleChange}
                required
              />
            </div>

           
            <button type="submit" className="btn btn-primary w-100">
              Submit
            </button>
          </form>
          
        </div>

        {/* Display Submitted Marriage Details  */}
        {submitted && (
          <div className="card p-4 mt-4 shadow">
            <h3 className="text-center mb-3">Marriage Details</h3>
            <p><strong>Bride Name:</strong> {brideName}</p>
            <p><strong>Groom Name:</strong> {groomName}</p>
            <p><strong>Date:</strong> {date}</p>
            <p><strong>Venue:</strong> {venue}</p>
          </div>
        )}
      </div>
    );
  }
}

export default MarriageForm; 
