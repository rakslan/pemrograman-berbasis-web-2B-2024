<?php
session_start();

if(!isset($_SESSION['username'])) {
    header("Location: index.php");
    exit;
}

$username = $_SESSION['username'];
?>


<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
    <link rel="stylesheet" href="style.css">
</head> 
<body>
    <div class="container">
        <b><h2>WELCOME</h2></b>
        <br>
        <p>Selamat datang <?php echo $username; ?>,  Bagaimana hari ini !!</p>
        <br>
        <br>
        <br>
        <a href="mahasiswa.php" class="logout-button">Data</a>
    </div>
</body>
</html>