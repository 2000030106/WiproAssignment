package assignments;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Product {
    private Long id;
    private String name;
    private String category;
    private Double price;

    public Product(Long id, String name, String category, Double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Long getId() {
    	return id; 
    	}
    public void setId(Long id) { 
    	this.id = id;
    	}

    public String getName() { 
    	return name; 
    	}
    public void setName(String name) { 
    	this.name = name;
    	}

    public String getCategory() { 
    	return category; 
    	}
    public void setCategory(String category) {
    	this.category = category;
    	}

    public Double getPrice() { 
    	return price; 
    	}
    public void setPrice(Double price) { 
    	this.price = price; 
    	}

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
    }
}

class Customer {
    private Long id;
    private String name;
    private Integer tier;

    public Customer(Long id, String name, Integer tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
    }

    public Long getId() { 
    	return id; 
    	}
    public void setId(Long id) { 
    	this.id = id; 
    	
    }

    public String getName() { 
    	return name;
    	}
    public void setName(String name) {
    	this.name = name; 
    	}

    public Integer getTier() {
    	return tier; 
    	}
    public void setTier(Integer tier) {
    	this.tier = tier;
    	}

    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", tier=" + tier + "]";
    }
}

class Order {
    private Long id;
    private String status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private List<Product> products;
    private Customer customer;

    public Order(Long id, String status, LocalDate orderDate, LocalDate deliveryDate,
                 List<Product> products, Customer customer) {
        this.id = id;
        this.status = status;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.products = products;
        this.customer = customer;
    }

    public Long getId() { 
    	return id; 
    	}
    public void setId(Long id) { 
    	this.id = id; 
    	}

    public String getStatus() {
    	return status;
    	}
    public void setStatus(String status) {
    	this.status = status; 
    	}

    public LocalDate getOrderDate() { 
    	return orderDate;
    	}
    public void setOrderDate(LocalDate orderDate) { 
    	this.orderDate = orderDate; 
    	}

    public LocalDate getDeliveryDate() { 
    	return deliveryDate; 
    	}
    public void setDeliveryDate(LocalDate deliveryDate) {
    	this.deliveryDate = deliveryDate;
    	}

    public List<Product> getProducts() {
    	return products;
    	}
    public void setProducts(List<Product> products) {
    	this.products = products; 
    	}

    public Customer getCustomer() {
    	return customer;
    	}
    public void setCustomer(Customer customer) {
    	this.customer = customer;
    	}

    @Override
    public String toString() {
        return "Order [id=" + id + ", status=" + status +
               ", orderDate=" + orderDate + ", deliveryDate=" + deliveryDate +
               ", products=" + products + ", customer=" + customer + "]";
    }
}
public class StreamApiActivity {
    public static void main(String[] args) {

    	Product p1 = new Product(1L, "Java Book", "Books", 150.0);
        Product p2 = new Product(2L, "Python Book", "Books", 90.0);
        Product p3 = new Product(3L, "Toy Car", "Toys", 250.0);
        Product p4 = new Product(4L, "Diapers", "Baby", 300.0);
        Product p5 = new Product(5L, "Barbie Doll", "Toys", 500.0);
        Product p6 = new Product(6L, "Story Book", "Books", 120.0);

        Customer c1 = new Customer(1L, "Alice", 1);
        Customer c2 = new Customer(2L, "Bob", 2);
        Customer c3 = new Customer(3L, "David", 2);

        List<Order> orders = List.of(
            new Order(101L, "Delivered", LocalDate.of(2021, 2, 10), LocalDate.of(2021, 2, 15), List.of(p1, p4), c2),
            new Order(102L, "Delivered", LocalDate.of(2021, 3, 5), LocalDate.of(2021, 3, 8), List.of(p2, p3), c2),
            new Order(103L, "Pending", LocalDate.of(2021, 1, 20), LocalDate.of(2021, 1, 25), List.of(p6), c1),
            new Order(104L, "Shipped", LocalDate.of(2021, 2, 22), LocalDate.of(2021, 2, 28), List.of(p5, p6), c3)
        );

        List<Product> products = List.of(p1, p2, p3, p4, p5, p6);

        // Q1: Books with price greater 100
        System.out.println("Q1: Books > 100");
        products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Books") && p.getPrice() > 100)
                .forEach(System.out::println);

        // Q2: Orders with 'Baby' products
        System.out.println("\nQ2: Orders with 'Baby' products");
        orders.stream()
              .filter(o -> o.getProducts().stream()
                            .anyMatch(p -> p.getCategory().equalsIgnoreCase("Baby")))
              .forEach(System.out::println);

        // Q3: Toys with 10% discount
        System.out.println("\nQ3: Toys with 10% discount");
        products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Toys"))
                .map(p -> new Product(p.getId(), p.getName(), p.getCategory(), p.getPrice() * 0.9))
                .forEach(System.out::println);

        // Q4: Products ordered by tier 2 customers between 01-Feb and 01-Apr 2021
        System.out.println("\nQ4: Tier 2 orders from Feb-Apr 2021");
        orders.stream()
              .filter(o -> o.getCustomer().getTier() == 2 &&
                           !o.getOrderDate().isBefore(LocalDate.of(2021, 2, 1)) &&
                           !o.getOrderDate().isAfter(LocalDate.of(2021, 4, 1)))
              .flatMap(o -> o.getProducts().stream())
              .distinct()
              .forEach(System.out::println);

        // Q5: Cheapest Book
        System.out.println("\nQ5: Cheapest Book");
        products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
                .sorted(Comparator.comparing(Product::getPrice))
                .findFirst()
                .ifPresent(System.out::println);

        // Q6: 3 Most recent orders
        System.out.println("\nQ6: 3 Most Recent Orders");
        orders.stream()
              .sorted(Comparator.comparing(Order::getOrderDate).reversed())
              .limit(3)
              .forEach(System.out::println);

        // Q7: Total lump sum of Feb 2021 orders
        System.out.println("\nQ7: Total of Feb 2021 Orders");
        double totalFeb = orders.stream()
                .filter(o -> o.getOrderDate().getMonthValue() == 2 && o.getOrderDate().getYear() == 2021)
                .flatMap(o -> o.getProducts().stream())
                .mapToDouble(Product::getPrice)
                .sum();
        System.out.println("Rupees" + totalFeb);

        // Q8: Stats for Book category
        System.out.println("\nQ8: Book Category Stats");
        DoubleSummaryStatistics stats = products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
                .mapToDouble(Product::getPrice)
                .summaryStatistics();
        System.out.println("Count: " + stats.getCount() + ", Sum: Rupees" + stats.getSum() + ", Avg: Rupees" + stats.getAverage() + ", Max: Rupees" + stats.getMax() + ", Min: ₹" + stats.getMin());

        // Q9: Most expensive product by category
        System.out.println("\nQ9: Most Expensive Product by Category");
        Map<String, Optional<Product>> expensiveByCategory = products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.maxBy(Comparator.comparing(Product::getPrice))
                ));
        expensiveByCategory.forEach((category, productOpt) -> 
            System.out.println(category + ": " + productOpt.orElse(null))
        );
    }
}


/*
 * Q1: Books > 100
Product [id=1, name=Java Book, category=Books, price=150.0]
Product [id=6, name=Story Book, category=Books, price=120.0]

Q2: Orders with 'Baby' products
Order [id=101, status=Delivered, orderDate=2021-02-10, deliveryDate=2021-02-15, products=[Product [id=1, name=Java Book, category=Books, price=150.0], Product [id=4, name=Diapers, category=Baby, price=300.0]], customer=Customer [id=2, name=Bob, tier=2]]

Q3: Toys with 10% discount
Product [id=3, name=Toy Car, category=Toys, price=225.0]
Product [id=5, name=Barbie Doll, category=Toys, price=450.0]

Q4: Tier 2 orders from Feb-Apr 2021
Product [id=1, name=Java Book, category=Books, price=150.0]
Product [id=4, name=Diapers, category=Baby, price=300.0]
Product [id=2, name=Python Book, category=Books, price=90.0]
Product [id=3, name=Toy Car, category=Toys, price=250.0]
Product [id=5, name=Barbie Doll, category=Toys, price=500.0]
Product [id=6, name=Story Book, category=Books, price=120.0]

Q5: Cheapest Book
Product [id=2, name=Python Book, category=Books, price=90.0]

Q6: 3 Most Recent Orders
Order [id=102, status=Delivered, orderDate=2021-03-05, deliveryDate=2021-03-08, products=[Product [id=2, name=Python Book, category=Books, price=90.0], Product [id=3, name=Toy Car, category=Toys, price=250.0]], customer=Customer [id=2, name=Bob, tier=2]]
Order [id=104, status=Shipped, orderDate=2021-02-22, deliveryDate=2021-02-28, products=[Product [id=5, name=Barbie Doll, category=Toys, price=500.0], Product [id=6, name=Story Book, category=Books, price=120.0]], customer=Customer [id=3, name=David, tier=2]]
Order [id=101, status=Delivered, orderDate=2021-02-10, deliveryDate=2021-02-15, products=[Product [id=1, name=Java Book, category=Books, price=150.0], Product [id=4, name=Diapers, category=Baby, price=300.0]], customer=Customer [id=2, name=Bob, tier=2]]

Q7: Total of Feb 2021 Orders
Rupees1070.0

Q8: Book Category Stats
Count: 3, Sum: Rupees360.0, Avg: Rupees120.0, Max: Rupees150.0, Min: ₹90.0

Q9: Most Expensive Product by Category
Toys: Product [id=5, name=Barbie Doll, category=Toys, price=500.0]
Baby: Product [id=4, name=Diapers, category=Baby, price=300.0]
Books: Product [id=1, name=Java Book, category=Books, price=150.0]
*/
