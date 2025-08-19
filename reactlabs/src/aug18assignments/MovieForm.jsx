import React, { Component } from "react";

// this is a class component
class MovieForm extends Component {
  constructor(props) {
    super(props);
    console.log("constructor executed");

    //this is initial state form values
    this.state = {
      title: "",
      director: "",
      releaseYear: "",
      genre: "Action",
      rating: "",
      description: "",
      platforms: [],
      movies: [],
      showForm: true, // toggle form to demonstrate componentWillUnmount
    };
  }

  // Called before render when props/state changes
  static getDerivedStateFromProps(props, state) {
    console.log("getDerivedStateFromProps executed");
    return null; // No state change from props
  }

  // Called once after the component is mounted (rendered on the screen)
componentDidMount() {
  console.log("componentDidMount executed");
}

// Called before re-rendering when props/state change
// Decide whether the component should re-render (return true/false)
shouldComponentUpdate(nextProps, nextState) {
  console.log("shouldComponentUpdate executed");
  return true; // returning true means allow re-render
}

// Called right before the DOM updates
// Gives you a chance to capture some information 
getSnapshotBeforeUpdate(prevProps, prevState) {
  console.log("getSnapshotBeforeUpdate executed");
  return null; // return value will be passed to componentDidUpdate
}

// Called immediately after updating (re-render)
// Useful for making network requests or DOM manipulations
componentDidUpdate(prevProps, prevState, snapshot) {
  console.log("componentDidUpdate executed");
}

// Called right before the component is removed from the DOM
// Useful for cleanup (e.g., clear timers, cancel API calls, remove event listeners)
componentWillUnmount() {
  console.log("componentWillUnmount executed");
}


  // handle input changes
  handleChange = (e) => {
    const { name, value, type, checked } = e.target;
    if (type === "checkbox") {
      this.setState((prevState) => {
        if (checked) {
          return { platforms: [...prevState.platforms, value] };
        } else {
            // by using filter we can copy only the elements except value 
          return { platforms: prevState.platforms.filter((p) => p !== value) }; 
        }
      });
    } else {
      this.setState({ [name]: value });
    }
  };

  // handle form submission
  handleSubmit = (e) => {
    e.preventDefault();

    //destructure the values
    const { title, director, releaseYear, genre, rating, description, platforms } = this.state;

    const newMovie = {
      title,
      director,
      releaseYear,
      genre,
      rating,
      description,
      platforms,
    };

    this.setState((prevState) => ({
      movies: [...prevState.movies, newMovie], //spread operator is used to copy old array to  new array 
      title: "",
      director: "",
      releaseYear: "",
      genre: "Action",
      rating: "",
      description: "",
      platforms: [],
    }));
  };

 // Method to toggle the form's visibility
toggleForm = () => {
  // setState with a callback function to ensure we use the latest state
  this.setState((prevState) => ({
    // Flip the boolean value: if true → false, if false → true
    showForm: !prevState.showForm
  }));
};


  render() {
    console.log("render executed");
    return (
      <div className="container mt-4">
        <button className="btn btn-warning mb-3" onClick={this.toggleForm}>
          {this.state.showForm ? "Unmount Form" : "Mount Form"}
        </button>

        {this.state.showForm && (
          <div className="card p-4">
            <h3 className="mb-3">Add Movie</h3>
            <form onSubmit={this.handleSubmit}>
              {/* Movie Title */}
              <div className="mb-3">
                <label className="form-label">Movie Title</label>
                <input
                  type="text"
                  className="form-control"
                  name="title"
                  value={this.state.title}
                  onChange={this.handleChange}
                  required
                />
              </div>

              {/* Director */}
              <div className="mb-3">
                <label className="form-label">Director</label>
                <input
                  type="text"
                  className="form-control"
                  name="director"
                  value={this.state.director}
                  onChange={this.handleChange}
                  required
                />
              </div>

              {/* Release Year */}
              <div className="mb-3">
                <label className="form-label">Release Year</label>
                <input
                  type="number"
                  className="form-control"
                  name="releaseYear"
                  value={this.state.releaseYear}
                  onChange={this.handleChange}
                  required
                />
              </div>

              {/* Genre */}
              <div className="mb-3">
                <label className="form-label">Genre</label>
                <select
                  className="form-select"
                  name="genre"
                  value={this.state.genre}
                  onChange={this.handleChange}
                  required
                >
                  <option value="Action">Action</option>
                  <option value="Comedy">Comedy</option>
                  <option value="Drama">Drama</option>
                  <option value="Sci-Fi">Sci-Fi</option>
                  <option value="Horror">Horror</option>
                </select>
              </div>

              {/* Rating */}
              <div className="mb-3">
                <label className="form-label">Rating</label>
                <br />
                {[1, 2, 3, 4, 5].map((num) => (
                  <label key={num} className="me-2">
                    <input
                      type="radio"
                      name="rating"
                      value={num}
                      checked={this.state.rating === String(num)}
                      onChange={this.handleChange}
                      className="me-1"
                    />
                    {num}
                  </label>
                ))}
              </div>

              {/* Description */}
              <div className="mb-3">
                <label className="form-label">Description</label>
                <textarea
                  className="form-control"
                  name="description"
                  value={this.state.description}
                  onChange={this.handleChange}
                />
              </div>

              {/* Platforms */}
              <div className="mb-3">
                <label className="form-label">Available on Streaming Platforms</label>
                <br />
                {["Netflix", "Amazon Prime", "Disney+", "Others"].map((platform) => (
                  <label key={platform} className="me-3">
                    <input
                      type="checkbox"
                      value={platform}
                      checked={this.state.platforms.includes(platform)}
                      onChange={this.handleChange}
                      className="me-1"
                    />
                    {platform}
                  </label>
                ))}
              </div>

              <button type="submit" className="btn btn-primary">
                Add Movie
              </button>
            </form>
          </div>
        )}

        {/* Movies Table */}
        {this.state.movies.length > 0 && (
          <div className="mt-4">
            <h4>Movie List</h4>
            <table className="table table-bordered">
              <thead>
                <tr>
                  <th>Title</th>
                  <th>Director</th>
                  <th>Release Year</th>
                  <th>Genre</th>
                  <th>Rating</th>
                  <th>Description</th>
                  <th>Available on</th>
                </tr>
              </thead>
              <tbody>
                {this.state.movies.map((movie, index) => (
                  <tr key={index}>
                    <td>{movie.title}</td>
                    <td>{movie.director}</td>
                    <td>{movie.releaseYear}</td>
                    <td>{movie.genre}</td>
                    <td>{movie.rating}</td>
                    <td>{movie.description}</td>
                    <td>{movie.platforms.join(", ")}</td>
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

export default MovieForm;
