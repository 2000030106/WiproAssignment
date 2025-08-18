const services = [
  {
    serviceName: 'Shirt',
    price: 20,
    fabricsAvailable: ['Cotton', 'Linen', 'Polyester'],
  },
  {
    serviceName: 'Pants',
    price: 30,
    fabricsAvailable: ['Denim', 'Wool', 'Chino'],
  },
  {
    serviceName: 'Lehenga',
    price: 150,
    fabricsAvailable: ['Silk', 'Georgette', 'Chiffon'],
  },
  {
    serviceName: 'Blouse',
    price: 40,
    fabricsAvailable: ['Cotton', 'Silk', 'Satin'],
  },
];

export const TailorShop = () => {
  let output = '';

  const dottedLine = (length) => '+ ' + '- '.repeat(length / 2) + '+';

  const colWidths = [12, 17, 17];
  const totalWidth = colWidths.reduce((sum, width) => sum + width, 0) + 10;

  output += dottedLine(totalWidth) + '\n';
  const headerText = 'Tailoring Services';
  const headerPadding = (totalWidth - headerText.length) / 2;
  output += `|${' '.repeat(Math.floor(headerPadding))}${headerText}${' '.repeat(Math.ceil(headerPadding))}|\n`;
  output += dottedLine(totalWidth) + '\n';

  const serviceNames = services.slice(0, 3).map(s => s.serviceName);
  output += `| ${serviceNames[0].padEnd(colWidths[0])} | ${serviceNames[1].padEnd(colWidths[1])} | ${serviceNames[2].padEnd(colWidths[2])} |\n`;
  output += `+${'-'.repeat(colWidths[0] + 2)}+${'-'.repeat(colWidths[1] + 2)}+${'-'.repeat(colWidths[2] + 2)}+\n`;

  let maxFabrics = Math.max(...services.slice(0, 3).map(s => s.fabricsAvailable.length));

  output += `| Price: $${services[0].price.toString().padEnd(colWidths[0]-7)} | Price: $${services[1].price.toString().padEnd(colWidths[1]-7)} | Price: $${services[2].price.toString().padEnd(colWidths[2]-7)} |\n`;
  output += `| Fabrics:    | Fabrics:         | Fabrics:        |\n`;
  for (let i = 0; i < maxFabrics; i++) {
    const shirtFabric = services[0].fabricsAvailable[i] || '';
    const pantsFabric = services[1].fabricsAvailable[i] || '';
    const lehengaFabric = services[2].fabricsAvailable[i] || '';
    output += `| - ${shirtFabric.padEnd(colWidths[0]-3)} | - ${pantsFabric.padEnd(colWidths[1]-3)} | - ${lehengaFabric.padEnd(colWidths[2]-3)} |\n`;
  }
  output += `+${'-'.repeat(colWidths[0] + 2)}+${'-'.repeat(colWidths[1] + 2)}+${'-'.repeat(colWidths[2] + 2)}+\n`;

  const blouse = services[3];
  output += `| ${blouse.serviceName.padEnd(colWidths[0])} |\n`;
  output += `+${'-'.repeat(colWidths[0] + 2)}+\n`;
  output += `| Price: $${blouse.price.toString().padEnd(colWidths[0]-7)} |\n`;
  output += `| Fabrics:    |\n`;
  blouse.fabricsAvailable.forEach(fabric => {
    output += `| - ${fabric.padEnd(colWidths[0]-3)} |\n`;
  });
  output += `+${'-'.repeat(colWidths[0] + 2)}+\n`;

  return <pre>{output}</pre>;
};

 export default TailorShop;