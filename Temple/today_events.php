<?php
// Database connection
$conn = new mysqli("localhost", "root", "", "kshethram_devotees");

if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Get today's date in Y-m-d format (for comparison with birthday and anniversary)
$today = date('Y-m-d');

// Fetch devotees who have a birthday or anniversary today
$sql = "SELECT id, name, first_name, birthday, anniversary, address, phone, alt_phone, email 
        FROM subscribers 
        WHERE MONTH(birthday) = MONTH(?) AND DAY(birthday) = DAY(?) 
        OR MONTH(anniversary) = MONTH(?) AND DAY(anniversary) = DAY(?)";

$stmt = $conn->prepare($sql);
$stmt->bind_param("ssss", $today, $today, $today, $today); // bind today's date to the query
$stmt->execute();
$result = $stmt->get_result();

echo "<h2>Today's Birthdays & Anniversaries</h2>";

if ($result->num_rows > 0) {
    echo "<table border='1' cellpadding='10' style='border-collapse: collapse; width: 100%;'>";
    echo "<thead><tr><th>Name</th><th>Birthday</th><th>Anniversary</th><th>Address</th><th>Phone</th><th>Alt Phone</th><th>Email</th></tr></thead>";
    echo "<tbody>";

    while ($row = $result->fetch_assoc()) {
        echo "<tr>";
        echo "<td>" . $row['name'] . " " . $row['first_name'] . "</td>";
        echo "<td>" . $row['birthday'] . "</td>";
        echo "<td>" . $row['anniversary'] . "</td>";
        echo "<td>" . nl2br($row['address']) . "</td>";  // Print address with line breaks
        echo "<td>" . $row['phone'] . "</td>";
        echo "<td>" . $row['alt_phone'] . "</td>";
        echo "<td>" . $row['email'] . "</td>";
        echo "</tr>";
    }

    echo "</tbody>";
    echo "</table>";
} else {
    echo "No devotees have birthdays or anniversaries today.";
}

$stmt->close();
$conn->close();
?>
