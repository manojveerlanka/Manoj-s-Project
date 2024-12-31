<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "temple_db";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Fetch form data
$name = $_POST['name'];
$first_name = $_POST['first_name'];
$gotram = $_POST['gotram'];
$email = $_POST['email'];
$phone = $_POST['phone'];
$alt_phone = $_POST['alt_phone'];
$birthday = $_POST['birthday'];
$anniversary = $_POST['anniversary'];
$permanent_subscriber = isset($_POST['permanent_subscriber']) ? 1 : 0;
$monthly = isset($_POST['monthly']) ? 1 : 0;
$monthly_start_date = $_POST['monthly_start_date'];
$monthly_end_date = $_POST['monthly_end_date'];
$quarterly = isset($_POST['quarterly']) ? 1 : 0;
$quarterly_start_date = $_POST['quarterly_start_date'];
$quarterly_end_date = $_POST['quarterly_end_date'];
$address = $_POST['address'];
$comments = $_POST['comments'];
$volunteer = isset($_POST['volunteer']) ? 1 : 0;

// Insert data into the database
$sql = "INSERT INTO devotees (
            name, first_name, gotram, email, phone, alt_phone, birthday, anniversary, 
            permanent_subscriber, monthly, monthly_start_date, monthly_end_date, 
            quarterly, quarterly_start_date, quarterly_end_date, address, comments, volunteer
        ) VALUES (
            '$name', '$first_name', '$gotram', '$email', '$phone', '$alt_phone', '$birthday', '$anniversary',
            '$permanent_subscriber', '$monthly', '$monthly_start_date', '$monthly_end_date',
            '$quarterly', '$quarterly_start_date', '$quarterly_end_date', '$address', '$comments', '$volunteer'
        )";

if ($conn->query($sql) === TRUE) {
    echo "New record created successfully";
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}

$conn->close();
?>
