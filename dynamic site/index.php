<?php
  include_once(__DIR__.'/funzioniPhp/connessione.php');
  include_once(__DIR__.'/funzioniPhp/album.php');

  $connessione = Connessione::apriConnessione();

  $arrayAlbum = array();
  $query = $connessione->query("SELECT * FROM album;");
  while ($ris = $query->fetch_assoc()) {
    $nuovoAlbum = new Album($ris["idAlbum"],$ris["nomeAlbum"],$ris["tipoAlbum"],$ris["annoUscita"],$ris["immagineAlbum"],$ris["noteAlbum"]);
    array_push($arrayAlbum,$nuovoAlbum);
  }
?>
<!DOCTYPE html>
<html lang="it">
  <head>
    <meta charset="utf-8">
    <meta name="keywords" content="verdena, rock, alternative">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="Verdena Lyrics, a project of mattiaudisio" name="description">
    <title>Verdena Lyrics</title>
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
  </head>

  <body>

    <!-- ======= Header ======= -->
    <header id="header" class="fixed-top ">
      <div class="container d-flex align-items-center">

        <h1 class="logo mr-auto"><a href="index.html">Verdena Lyrics</a></h1>

        <nav class="nav-menu d-none d-lg-block">
          <ul>
            <li class="active"><a href="index.html">Home</a></li>
            <li><a href="#about">About</a></li>
            <li><a href="#discografia">Discografia</a></li>
            <li><a href="#membri">Membri</a></li>
          </ul>
        </nav><!-- .nav-menu -->
      </div>
    </header><!-- End Header -->

    <!-- ======= Hero Section ======= -->
    <section id="hero" class="d-flex align-items-center">
      <div class="container position-relative" data-aos="fade-up" data-aos-delay="500">
        <h1>Verdena Lyrics</h1>
        <h2>Alla scoperta dei testi e degli album dei Verdena</h2>
        <a href="#discografia" class="btn-get-started scrollto">Clicca qui</a>
      </div>
    </section><!-- End Hero -->

    <main id="main">

      <!-- ======= About Section ======= -->
      <section id="about" class="about">
        <div class="container">

          <div class="row">
            <div class="col-lg-6 order-1 order-lg-2" data-aos="fade-left">
              <img src="assets/img/about.jpg" class="img-fluid" alt="">
            </div>
            <div class="col-lg-6 pt-4 pt-lg-0 order-2 order-lg-1 content" data-aos="fade-right">
              <h3>Chi sono i Verdena?</h3>
              <p class="font-italic">
                I Verdena sono <b>Alberto Ferrari</b> (chitarra e voce), <b>Roberta</b> (basso) e <b>Luca Ferrari</b> (batteria).<br />
                Alberto e Luca sono fratelli, vivono ad <b>Albino</b> (BG) e hanno esplorato diversi generi musicali prima di conoscere Roberta, ex-chitarrista di un gruppo punk di Bergamo.<br />
                Influenzati inizialmente dai Nirvana, ma anche dalla psichedelia e dal rock degli anni ‘70, i Verdena si fanno conoscere a livello locale fino a quando un loro demo attira l’attenzione di diverse etichette.<br />
              </p>
              <p>
                Messi sotto contratto dalla Universal, affinano le loro qualità live prima di debuttare col singolo “<b>Valvonauta</b>” e l’album <b>VERDENA</b>, uscito nel 1999 e prodotto da Giorgio Canali dei CSI.<br /> Grazie ai molti passaggi su MTV, il singolo si trasforma in un buon successo, imponendo i Verdena come uno dei gruppi più promettenti della scena nostrana. Le esibizioni sui palchi dei festival rock italiani più importanti consolidano ulteriormente la fama del gruppo.<br />
                Il secondo album <b>SOLO UN GRANDE SASSO</b>, prodotto questa volta dal leader degli Afterhours Manuel Agnelli, esce nel 2001, preceduto dal singolo “<b>Spaceman</b>”.<br />
                Nel 2004 arriva il terzo disco, <b>IL SUICIDIO DEL SAMURAI</b>, il primo totalmente prodotto dal gruppo stesso. A fine 2006 viene annunciato il quarto disco della band, che esce a Marzo 2007 e si intitola <b>REQUIEM</b>. Contestualmente, il gruppo annuncia un tour per lo stesso periodo.
                Alla conclusione della tournée i Verdena si ritirano in Valle Lujo, ai piedi del Monte Misma (Bergamo), dove per tre anni danno pochissime notizie di loro.<br />
                Nel gennaio del 2011 che vede la luce il quinto capitolo discografico <b>WOW</b>, un doppio album composto da ben 27 canzoni.<br />
                Nel 2013 il gruppo annuncia di essere al lavoro per un nuovo disco. Le prime notizie arrivano a fine 2014: il lavoro sarà doppio e uscirà in due puntate, la prima delle quali a fine gennaio 2015: si intitola <b>ENDKADENZ</b>. A fine agosto, dopo un trionfale tour, arriva <b>ENDKADENZ VOL. 2</b>.
              </p>
            </div>
          </div>

        </div>
      </section><!-- End About Section -->


      <!-- ======= Discografia Section ======= -->
      <section id="discografia" class="team">
        <div class="container">

          <div class="section-title">
            <span>Discografia</span>
            <h2>Discografia</h2>
          </div>
          <div class="row">
          <?php
          for ($i=0; $i < count($arrayAlbum); $i++) {
            echo '<div class="col-lg-4 col-md-6 d-flex align-items-stretch" data-aos="zoom-in">
              <div class="member">
                <a href="album.php?id='.$arrayAlbum[$i]->getIdAlbum().'"><img src="assets/img/discografia/'.$arrayAlbum[$i]->getImmagineAlbum().'" alt="">
                <h4>'.$arrayAlbum[$i]->getNomeAlbum().'</a></h4>
                <span>'.$arrayAlbum[$i]->getTipoAlbum().', '.$arrayAlbum[$i]->getAnnoUscita().'</span>
              </div>
            </div>';
          }

          ?>

          </div>

        </div>

      </section><!-- End Team Section -->

      <!-- ======= Team Section ======= -->
      <section id="membri" class="team">
        <div class="container">

          <div class="section-title">
            <span>Membri</span>
            <h2>Membri</h2>
          </div>

          <div class="row">
            <div class="col-lg-4 col-md-6 d-flex align-items-stretch" data-aos="zoom-in">
              <div class="member">
                <img src="assets/img/membri/alberto.jpg" alt="">
                <h4>Alberto Ferrari</h4>
                <span>1995 - presente</span>
                <p>
                  voce, chitarra, pianoforte, tastiere, basso
                </p>
              </div>
            </div>

            <div class="col-lg-4 col-md-6 d-flex align-items-stretch" data-aos="zoom-in">
              <div class="member">
                <img src="assets/img/membri/roberta.jpg" alt="">
                <h4>Roberta Sammarelli</h4>
                <span>1996 - presente</span>
                <p>
                  basso, tastiere, cori
                </p>
              </div>
            </div>

            <div class="col-lg-4 col-md-6 d-flex align-items-stretch" data-aos="zoom-in">
              <div class="member">
                <img src="assets/img/membri/luca.jpg" alt="">
                <h4>Luca Ferrari</h4>
                <span>1995 - presente</span>
                <p>
                  batteria, percussioni, synth, cori
                </p>
              </div>
            </div>

          </div>

        </div>
      </section><!-- End Team Section -->
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
    </footer>
    <a href="#" class="back-to-top"><i class="icofont-simple-up"></i></a>
    <div id="preloader"></div>
    <script src="assets/vendor/jquery/jquery.min.js"></script>
    <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <script src="assets/vendor/jquery.easing/jquery.easing.min.js"></script>
    <script src="assets/vendor/php-email-form/validate.js"></script>
    <script src="assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
    <script src="assets/vendor/venobox/venobox.min.js"></script>
    <script src="assets/vendor/owl.carousel/owl.carousel.min.js"></script>
    <script src="assets/vendor/aos/aos.js"></script>
    <script src="assets/js/main.js"></script>
  </body>
</html>
