<?php
// Database connection
$conn = new mysqli("localhost", "root", "", "kshethram_devotees");

if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}
$today = date('Y-m-d'); // Format: YYYY-MM-DD
// Fetch monthly subscribers
$sql = "SELECT name, first_name, address, phone, alt_phone, email, monthly_start_date, monthly_end_date FROM subscribers WHERE 
            (('$today' BETWEEN monthly_start_date AND monthly_end_date ) AND monthly = 1)
            OR permanent_subscriber = 1";
$result = $conn->query($sql);

echo "<h2>Monthly Subscribers - Address List</h2>";

if ($result->num_rows > 0) {
    // Loop through each subscriber and print their details in the requested format
    while ($row = $result->fetch_assoc()) {
        // Display each subscriber's info
        echo "<p><strong>Name:</strong> " . $row['name'] . " " . $row['first_name'] . "</p>";
        
        // Replace commas with <br> tags to break the address into multiple lines
        $address = str_replace(",", ",<br>", $row['address']);  // Replace commas with <br>
        echo "<p><strong>Address:</strong> " . $address . "</p>";
        
        echo "<p><strong>Phone Number:</strong> " . $row['phone'] . "</p>";
        echo "<p><strong>Alternate Phone Number:</strong> " . $row['alt_phone'] . "</p>";
        
        // Add space between each subscriber
        echo "<br><br>";
    }
} else {
    echo "No monthly subscribers found.";
}

$conn->close();
?>
