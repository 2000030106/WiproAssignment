import React from "react";

// Array of tailoring services
const services = [
  {
    serviceName: "Shirt",
    price: 20,
    fabricsAvailable: ["Cotton", "Linen", "Polyester"],
  },
  {
    serviceName: "Pants",
    price: 30,
    fabricsAvailable: ["Denim", "Wool", "Chino"],
  },
  {
    serviceName: "Lehenga",
    price: 150,
    fabricsAvailable: ["Silk", "Georgette", "Chiffon"],
  },
  {
    serviceName: "Blouse",
    price: 40,
    fabricsAvailable: ["Cotton", "Silk", "Satin"],
  },
];
// Functional Component
export const TailorShop1 = () => {
  return (
    // Bootstrap container with top margin
    <div className="container mt-4">
      <h2 className="text-center mb-4">Tailoring Services</h2>

      {/* First 3 services in table */}
      <div className="table-responsive">
               {/* Bootstrap table with borders and centered text */}
        <table className="table table-bordered text-center align-middle">
          <thead className="table-dark">
            <tr>
                  {/* Create table headers dynamically for Shirt, Pants, Lehenga */}
              {services.slice(0, 3).map((service, index) => (
                <th key={index}>{service.serviceName}</th>
              ))}
            </tr>
          </thead>
          <tbody>
            <tr>
                {/* Row showing prices of first 3 services */}

              {services.slice(0, 3).map((service, index) => (
                <td key={index}>Price: ₹{service.price}</td>
              ))}
            </tr>
            <tr>
                {/* Row showing fabrics list of first 3 services */}
              {services.slice(0, 3).map((service, index) => (
                <td key={index}>
                  <strong>Fabrics:</strong>
                            {/* Unordered list without bullets (Bootstrap class list-unstyled) */}

                  <ul className="list-unstyled mt-2">
                    {service.fabricsAvailable.map((fabric, i) => (
                      <li key={i}>• {fabric}</li>
                    ))}
                  </ul>
                </td>
              ))}
            </tr>
          </tbody>
        </table>
      </div>

      {/* Blouse as Bootstrap Card */}
        {/* Displaying Blouse separately as a Bootstrap card */}

      <div className="row mt-4 justify-content-center">
            {/* One column taking 4/12 width on medium+ screens */}
        <div className="col-md-4">
          <div className="card shadow">
            <div className="card-header bg-primary text-white">
              {services[3].serviceName}
            </div>
                    {/* Card body for price and fabrics */}
            <div className="card-body">
              <p>
                <strong>Price:</strong> ₹{services[3].price}
              </p>
              <p>
                <strong>Fabrics:</strong>
              </p>
              <ul>
                   {/* Loop through blouse fabrics */}
                {services[3].fabricsAvailable.map((fabric, i) => (
                  <li key={i}>{fabric}</li>
                ))}
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default TailorShop1;
