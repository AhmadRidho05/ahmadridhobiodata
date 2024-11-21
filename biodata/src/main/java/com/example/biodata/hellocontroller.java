package com.example.biodata;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {
    @RequestMapping("/")
    public String hello(){
        return """
<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Biodata Saya</title>
    <style>
       
        .container {
            font-family: BookAntiqua, Bookman Old Style;
            width: 50%;
            margin: 50px auto;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.3);
            
           
            background-image: url('https://png.pngtree.com/thumb_back/fw800/back_our/20190621/ourmid/pngtree-my-resume-background-material-image_177383.jpg'); 
            background-size: cover; 
            background-position: center; 
            background-repeat: no-repeat; 
        }

        h1 {
            text-align: center;
            color: #000000; 
            margin-bottom: 20px;
            text-shadow: 2px 2px 5px rgba(0, 0, 0, 0.5);
        }

        .profile-img {
            display: block;
            margin: 30px auto;
            width: 150px;
            height: 150px;
            border-radius: 50%;
            object-fit: cover;
        }

        .section {
            margin-bottom: 20px;
        }

        .section h2 {
            margin-bottom: 10px;
            color: #000000; 
        }

        .info-list {
            list-style: none;
            padding: 0;
        }

        .info-list li {
            padding: 8px 0;
            color: #green;
        }

        .info-list li strong {
            color: #000000;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Biodata Saya</h1>

        
        <img src="https://i.ibb.co.com/J5QWHpX/Whats-App-Image-2024-11-17-at-00-12-28.jpg" alt="Foto Profil" class="profile-img">
        
        
        <div class="section">
            <h2>Informasi Pribadi</h2>
            <ul class="info-list">
                <li><strong>Nama:</strong> Ahmad Ridho</li>
                <li><strong>Tempat, Tanggal Lahir:</strong> Bogor, 15 Februari 2005</li>
                <li><strong>Alamat:</strong> Kp Bulak RT01/05 Desa Padurenan Kec Gunung Sindur Kab Bogor</li>
                <li><strong>Telepon:</strong> +6282310752248</li>
                <li><strong>Email:</strong> ahmadrdho05@gmail.com</li>
            </ul>
        </div>

        
        <div class="section">
            <h2>Pendidikan</h2>
            <ul class="info-list">
                <li>S1 Teknologi Informasi, Universitas Nahdlatul Ulama Indonesia </li>
            </ul>
        </div>

        
        <div class="section">
            <h2>Keahlian</h2>
            <ul class="info-list">
                <li>HTML, CSS, JavaScript</li>
                <li>PHP, Python</li>
                <li>Database Management (MySQL, PostgreSQL)</li>
                <li>Version Control (Git)</li>
            </ul>
        </div>

        
        <div class="section">
            <h2>Hobi</h2>
            <ul class="info-list">
                <li>Membaca</li>
                <li>Bermain game</li>
            </ul>
        </div>
    </div>
</body>
</html>
 
        """;
    
    }
    }
        
                
