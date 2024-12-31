<?php
// Database connection
$conn = new mysqli("localhost", "root", "", "kshethram_devotees");

if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Fetch all subscribers including comments and volunteer option
$sql = "SELECT id, name, first_name, address, phone, alt_phone, email, monthly_start_date, monthly_end_date, quarterly_start_date, quarterly_end_date, comments, volunteer,birthday,anniversary, permanent_subscriber FROM subscribers";
$result = $conn->query($sql);

echo "<h2>All Devotees List</h2>";

if ($result->num_rows > 0) {
    // Start the table to display data in neat rows
    echo "<table border='1' cellpadding='10' style='border-collapse: collapse; width: 100%;'>";
    echo "<thead><tr><th>Name</th><th>Address</th><th>Phone</th><th>Alt Phone</th><th>Email</th><th>Birthday</th><th>Anniversary</th><th>Monthly Start Date</th><th>Monthly End Date</th><th>Quarterly Start Date</th><th>Quarterly End Date</th><th>Comments</th><th>Volunteer Option</th><th>Is Permanent Subscriber</th><th>Action</th></tr></thead>";
    echo "<tbody>";
    
    // Loop through each subscriber and print their details in rows
    while ($row = $result->fetch_assoc()) {
        // Convert volunteer from 1 or 0 to Yes or No
        $volunteer = ($row['volunteer'] == 1) ? 'Yes' : 'No';

        $permanent_subscriber = ($row['permanent_subscriber'] == 1) ? 'Yes' : 'No';
                
        echo "<tr>";
        echo "<td>" . $row['name'] . " " . $row['first_name'] . "</td>";
        echo "<td>" . nl2br($row['address']) . "</td>";  // Use nl2br to preserve line breaks in the address
        echo "<td>" . $row['phone'] . "</td>";
        echo "<td>" . $row['alt_phone'] . "</td>";
        echo "<td>" . $row['email'] . "</td>";
		echo "<td>" . $row['birthday'] . "</td>";
        echo "<td>" . $row['anniversary'] . "</td>";
        echo "<td>" . $row['monthly_start_date'] . "</td>";
        echo "<td>" . $row['monthly_end_date'] . "</td>";
        echo "<td>" . $row['quarterly_start_date'] . "</td>";
        echo "<td>" . $row['quarterly_end_date'] . "</td>";
        echo "<td>" . nl2br($row['comments']) . "</td>";  // Print comments with line breaks
        echo "<td>" . $volunteer . "</td>";  
          echo "<td>" . $permanent_subscriber . "</td>";     
        // Add a delete button with the devotee's ID
        echo "<td><a href='delete_devotee.php?id=" . $row['id'] . "' onclick='return confirm(\"Are you sure you want to delete?\")'>Delete</a></td>";
        echo "</tr>";
    }
    
    echo "</tbody>";
    echo "</table>";
} else {
    echo "No devotees found.";
}

$conn->close();
?>
