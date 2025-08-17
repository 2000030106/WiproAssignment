import React from "react";

const ServiceCard = ({ service }) => {
  return (
    <div className="col-md-4 mb-4">
      <div className="card shadow">
        <div className="card-body">
          <h5 className="card-title">{service.serviceName}</h5>
          <h6 className="card-subtitle mb-2 text-muted">Price: ${service.price}</h6>
          <p><strong>Fabrics:</strong></p>
          <ul>
            {service.fabricsAvailable.map((fabric, index) => (
              <li key={index}>{fabric}</li>
            ))}
          </ul>
        </div>
      </div>
    </div>
  );
};

export default ServiceCard;
