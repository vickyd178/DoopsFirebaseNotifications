# DoopsFirebaseNotifications
#Use Following php script to send notifications you can also use your own as per your need
```php
<?php
$message =  $_POST['message'];
$title = $_POST['title'];
$id = $_POST['deviceTokenId'];
$url = 'https://fcm.googleapis.com/fcm/send';

$fields = array (
	'to' => $id,
	'data' => array (
		"message" => $message,
		"title" => $title,
		"action" => "Action"));

$fields = json_encode ( $fields );

$headers = array (
	'Authorization: key=' . "YOUR_API_ACCESS_KEY_HERE",'Content-Type: application/json');
  
$ch = curl_init ();
curl_setopt ( $ch, CURLOPT_URL, $url );
curl_setopt ( $ch, CURLOPT_POST, true );
curl_setopt ( $ch, CURLOPT_HTTPHEADER, $headers );
curl_setopt ( $ch, CURLOPT_RETURNTRANSFER, true );
curl_setopt ( $ch, CURLOPT_POSTFIELDS, $fields );

$result = curl_exec ( $ch );

curl_close ( $ch );

echo $result;
```

© 2019 Vicky Dhope All Rights Reserved
