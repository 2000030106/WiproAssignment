<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    echo "<h2>Order Confirmation</h2>";

    echo "<h3>Customer Details</h3>";
    echo "Full Name: " . htmlspecialchars($_POST['fullname']) . "<br>";
    echo "Email: " . htmlspecialchars($_POST['email']) . "<br>";
    echo "Mobile Number: " . htmlspecialchars($_POST['mobile']) . "<br>";
    echo "Delivery Address: " . nl2br(htmlspecialchars($_POST['address'])) . "<br>";

    echo "<h3>Order Details</h3>";

    if (!empty($_POST['items'])) {
        echo "Items Ordered: " . implode(", ", $_POST['items']) . "<br>";
    } else {
        echo "Items Ordered: None selected<br>";
    }

    echo "Quantity: " . htmlspecialchars($_POST['quantity']) . "<br>";
    echo "Delivery Date: " . htmlspecialchars($_POST['delivery_date']) . "<br>";
    echo "Preferred Time: " . (!empty($_POST['delivery_time']) ? htmlspecialchars($_POST['delivery_time']) : "Not specified") . "<br>";
    echo "Payment Method: " . htmlspecialchars($_POST['payment']) . "<br>";

    echo "<h3>Special Instructions</h3>";
    echo !empty($_POST['instructions']) ? nl2br(htmlspecialchars($_POST['instructions'])) : "None";
    
    echo "<br><br><strong>Order Confirmed </strong>";
} else {
    echo "Invalid request!";
}
?>
