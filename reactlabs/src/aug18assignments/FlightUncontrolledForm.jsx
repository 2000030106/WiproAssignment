import React, { Component, createRef } from "react";

//  Uncontrolled Component 
class FlightBookingUncontrolled extends Component {
  constructor(props) {
    //we will use ref for uncontrolled component
    super(props);
    // create refs for each field
    this.flightNumberRef = createRef();
    this.sourceRef = createRef();
    this.destinationRef = createRef();
    this.dateRef = createRef();
    this.termsRef = createRef();
    this.state = {
      details: null, // store submitted details
    };
  }

  // handle form submission
  handleSubmit = (e) => {
    e.preventDefault();

    // here , it will collect values directly using refs
    const details = {
      flightNumber: this.flightNumberRef.current.value,
      source: this.sourceRef.current.value,
      destination: this.destinationRef.current.value,
      travelDate: this.dateRef.current.value,
      termsAccepted: this.termsRef.current.checked,
    };

    this.setState({ details });
  };

  render() {
    return (
      <div className="col-md-6">
        <h3>Uncontrolled Flight Booking Form</h3>
        <form onSubmit={this.handleSubmit}>
          {/* Flight Number */}
          <div className="mb-3">
            <label className="form-label">Flight Number</label>
            <input type="text" className="form-control" ref={this.flightNumberRef} required />
          </div>

          {/* Source */}
          <div className="mb-3">
            <label className="form-label">Source</label>
            <input type="text" className="form-control" ref={this.sourceRef} required />
          </div>

          {/* Destination */}
          <div className="mb-3">
            <label className="form-label">Destination</label>
            <input type="text" className="form-control" ref={this.destinationRef} required />
          </div>

          {/* Travel Date */}
          <div className="mb-3">
            <label className="form-label">Travel Date</label>
            <input type="date" className="form-control" ref={this.dateRef} required />
          </div>

          {/* Terms Checkbox */}
          <div className="mb-3 form-check">
            <input type="checkbox" className="form-check-input" ref={this.termsRef} />
            <label className="form-check-label">Terms Accepted</label>
          </div>

          <button type="submit" className="btn btn-success">Submit</button>
        </form>

        {/* Display Submitted Data */}
        {this.state.details && (
          <div className="card mt-4">
            <div className="card-body">
              <h5 className="card-title">Flight Details</h5>
              <p><b>Flight Number:</b> {this.state.details.flightNumber}</p>
              <p><b>Source:</b> {this.state.details.source}</p>
              <p><b>Destination:</b> {this.state.details.destination}</p>
              <p><b>Travel Date:</b> {this.state.details.travelDate}</p>
              <p><b>Terms Accepted:</b> {this.state.details.termsAccepted ? "Yes" : "No"}</p>
            </div>
          </div>
        )}
      </div>
    );
  }
}

export default FlightBookingUncontrolled;