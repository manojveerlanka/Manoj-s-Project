<?php
// Database connection
$conn = new mysqli("localhost", "root", "", "kshethram_devotees");

if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Get today's date
$today = date('Y-m-d');

// Query for birthdays or anniversaries
$sql = "SELECT name, email, birthday, anniversary FROM subscribers 
        WHERE (DATE(birthday) = ? OR DATE(anniversary) = ?)";

$stmt = $conn->prepare($sql);
$stmt->bind_param("ss", $today, $today);
$stmt->execute();
$result = $stmt->get_result();

if ($result->num_rows > 0) {
    while ($row = $result->fetch_assoc()) {
        $name = $row['name'];
        $email = $row['email'];
        $subject = "Warm Greetings from Our Temple!";
        $message = "";

        // Check if it's a birthday or anniversary
        if ($row['birthday'] === $today) {
            $message .= "Dear $name,\n\nHappy Birthday! 🎉 May your day be filled with joy, blessings, and happiness.\n\n";
        }
        if ($row['anniversary'] === $today) {
            if (!empty($message)) {
                $message .= "\n"; // Add a new line between messages
            }
            $message .= "Dear $name,\n\nHappy Anniversary! 🌟 Wishing you and your family a day filled with love and blessings.\n\n";
        }

        $message .= "With warm regards,\nTemple Team";

        // Send email
        sendEmail($email, $subject, $message);
    }
} else {
    echo "No reminders for today.";
}

// Function to send email
function sendEmail($to, $subject, $message) {
    $headers = "From: dharmendra.koppineni@outlook.com" . "\r\n" .
               "Reply-To: dharmendra.koppineni@outlook.com" . "\r\n" .
               "X-Mailer: PHP/" . phpversion();

    if (mail($to, $subject, $message, $headers)) {
        echo "Email sent successfully to $to.\n";
    } else {
        echo "Failed to send email to $to.\n";
    }
}

$stmt->close();
$conn->close();
?>
