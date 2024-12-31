<?php
// Check if ID is provided in the URL
if (isset($_GET['id'])) {
    $id = $_GET['id'];

    // Database connection
    $conn = new mysqli("localhost", "root", "", "kshethram_devotees");

    if ($conn->connect_error) {
        die("Connection failed: " . $conn->connect_error);
    }

    // Prepare DELETE SQL query
    $sql = "DELETE FROM subscribers WHERE id = ?";
    
    // Prepare statement
    $stmt = $conn->prepare($sql);
    $stmt->bind_param("i", $id);  // "i" means integer
    
    // Execute the query and check if the delete was successful
    if ($stmt->execute()) {
        echo "Devotee deleted successfully.";
    } else {
        echo "Error deleting devotee: " . $stmt->error;
    }

    // Close the database connection
    $stmt->close();
    $conn->close();

    // Redirect back to the All Devotees List page
    header("Location: simple.html");
    exit();
} else {
    echo "No devotee ID provided.";
}
?>
