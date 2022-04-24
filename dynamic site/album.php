<?php
  include_once(__DIR__.'/funzioniPhp/connessione.php');
  include_once(__DIR__.'/funzioniPhp/album.php');
  include_once(__DIR__.'/funzioniPhp/canzone.php');

  $connessione = Connessione::apriConnessione();

  if(isset($_GET['id'])){
    $arrayCanzoni = array();
    $query = $connessione->query("SELECT * FROM album WHERE album.idAlbum = '".$_GET['id']."';");
    while ($ris = $query->fetch_assoc()) {
      $nuovoAlbum = new Album($ris["idAlbum"],$ris["nomeAlbum"],$ris["tipoAlbum"],$ris["annoUscita"],$ris["immagineAlbum"],$ris["noteAlbum"]);
    }
    $query = $connessione->query("SELECT * FROM canzone WHERE canzone.idAlbum = '".$_GET['id']."';");
    while ($ris = $query->fetch_assoc()) {
      $nuovaCanzone = new Canzone($ris["idCanzone"],$ris["nomeCanzone"],"",$ris["writtenBy"],$ris["producedBy"],"",$ris["idAlbum"]);
      array_push($arrayCanzoni,$nuovaCanzone);
    }
  } else {
  header('location:index.php#discografia');
  }
?>
<!DOCTYPE html>
<html lang="it">

<head>
  <meta charset="utf-8">
  <meta name="keywords" content="verdena, rock, alternative">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <meta content="Verdena album compilation: Afterhours versus Verdena" name="description">

  <title><?php echo $nuovoAlbum->getNomeAlbum();?></title>
  <link href="assets/img/favicon.png" rel="icon">
  <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">
  <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/vendor/icofont/icofont.min.css" rel="stylesheet">
  <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="assets/vendor/venobox/venobox.css" rel="stylesheet">
  <link href="assets/vendor/owl.carousel/assets/owl.carousel.min.css" rel="stylesheet">
  <link href="assets/vendor/aos/aos.css" rel="stylesheet">
  <link href="assets/css/style.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="assets/css/style.css" rel="stylesheet">

  <style>
    a:hover {
      color: #fff;
      text-decoration: none;
    }
  </style>
</head>

<body>

  <!-- ======= Header ======= -->
  <header id="header" class="fixed-top ">
    <div class="container d-flex align-items-center">

      <h1 class="logo mr-auto"><a href="../index.php">Verdena Lyrics</a></h1>

      <nav class="nav-menu d-none d-lg-block">
        <ul>
          <li class="active"><a href="../index.php">Home</a></li>
          <li><a href="index.php#about">About</a></li>
          <li><a href="index.php#discografia">Discografia</a></li>
          <li><a href="index.php#membri">Membri</a></li>
        </ul>
      </nav><!-- .nav-menu -->
    </div>
  </header><!-- End Header -->

  <!-- ======= Hero Section ======= -->
  <section id="hero" class="d-flex align-items-center">
    <div class="container position-relative" data-aos="fade-up" data-aos-delay="500">
      <h1>Verdena Lyrics</h1>
      <h2>Alla scoperta dei testi e degli album dei Verdena</h2>
    </div>
  </section><!-- End Hero -->

  <main>

    <!-- ======= About Section ======= -->
    <section class="about">
      <div class="container">

        <div class="row">
          <div class="col-lg-6 order-1 order-lg-2" data-aos="fade-left">
            <?php
              echo '<img src="assets/img/discografia/'.$nuovoAlbum->getImmagineAlbum().'" class="img-fluid" alt="" style="width: 400px; height: 400px">';
            ?>
          </div>
          <div class="col-lg-6 pt-4 pt-lg-0 order-2 order-lg-1 content" data-aos="fade-right">
            <h3><?php echo $nuovoAlbum->getNomeAlbum();?></h3>
            <p class="font-italic">
              <?php echo $nuovoAlbum->getTestoAlbum();?>
            </p>
          </div>
        </div>

      </div>
    </section><!-- End About Section -->

    <!-- ======= Why Us Section ======= -->
    <section id="why-us" class="why-us">
      <div class="container">

        <div class="row">

          <?php
            for ($i=0; $i < count($arrayCanzoni); $i++) {
              echo '<div class="col-lg-4" data-aos="fade-up">
                    <div class="box">
                      <span>'. $i + 1 .'</span>
                      <h4><a href="canzone.php?id='.$arrayCanzoni[$i]->getIdCanzone().'">'.$arrayCanzoni[$i]->getNomeCanzone().'</a></h4>
                      <p>Written by '.$arrayCanzoni[$i]->getWrittenBy().'</p>
                        <p>Produced by '.$arrayCanzoni[$i]->getProducedBy().'</p>
                    </div>
                  </div>';
            }
          ?>
      </div>
    </section><!-- End Why Us Section -->

  </main><!-- End #main -->

  <!-- ======= Footer ======= -->
  <footer id="footer">
    <div class="footer-top">
      <div class="container">
        <div class="row">

          <div class="col-lg-4 col-md-6">
            <div class="footer-info">
              <h3>Verdena Lyrics</h3>
              <p>
                a project of <strong><a href="https://github.com/mattiaudisio/VerdenaLyrics">mattiaudisio</a></strong><br />
              </p>
              <div class="social-links mt-3">
                <a href="https://github.com/mattiaudisio" class="github"><i class="bx bxl-github"></i></a>
                <a href="https://it.linkedin.com/in/mattia-audisio-75a935204" class="linkedin"><i class="bx bxl-linkedin"></i></a>
              </div>
            </div>
          </div>

        </div>
      </div>
    </div>
  </footer><!-- End Footer -->

  <a href="#" class="back-to-top"><i class="icofont-simple-up"></i></a>
  <div id="preloader"></div>

  <!-- Vendor JS Files -->
  <script src="assets/vendor/jquery/jquery.min.js"></script>
  <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="assets/vendor/jquery.easing/jquery.easing.min.js"></script>
  <script src="assets/vendor/php-email-form/validate.js"></script>
  <script src="assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
  <script src="assets/vendor/venobox/venobox.min.js"></script>
  <script src="assets/vendor/owl.carousel/owl.carousel.min.js"></script>
  <script src="assets/vendor/aos/aos.js"></script>

  <!-- Template Main JS File -->
  <script src="assets/js/main.js"></script>

</body>

</html>
