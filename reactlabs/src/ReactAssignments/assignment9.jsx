import React from "react";

//this is funcional component
const TempleList = () => {
  const temples = [ //this is array of json objects 
    {
        id: 1,
      name: "Sri Venkateswara Temple",
      location: "Tirupati, Andhra Pradesh",
      deities: ["Venkateswara", "Lakshmi"]
      
    },
    {
     id: 2,
      name: "Meenakshi Amman Temple",
      location: "Madurai, Tamil Nadu",
      deities: ["Meenakshi", "Sundareshwarar"]
    },
    {
      id: 3,
      name: "Jagannath Temple",
      location: "Puri, Odisha",
      deities: ["Jagannath", "Balabhadra", "Subhadra"]
    }
  ];

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      <h2>🙏 Famous Temples in India</h2>
    {/* table rendering to get data in jsx in browser*/}
      <table border="1" cellPadding="10" cellSpacing="0" style={{ borderCollapse: "collapse", width: "100%" }}>
        <thead>
          <tr>
            <th>ID</th>
            <th>Temple Name</th>
            <th>Location</th>
            <th>Deities</th>
          </tr>
        </thead>
        <tbody>
          {temples.map((temple) => ( //Outer .map() to iterate over temples.
            <tr key={temple.id}> {/* unique id to get each temple */}
              <td>{temple.id}</td>
              <td>{temple.name}</td>
              <td>{temple.location}</td>
              <td>
                {/* List rendering to get dieties in temples table*/}
                <ul>
                  {temple.deities.map((deity, index) => ( //nested map()- Inner .map() to iterate over each temple’s deities.
                    <li key={index}>{deity}</li> //{index} for deities list items inside nested map.
                  ))}
                </ul>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default TempleList;
