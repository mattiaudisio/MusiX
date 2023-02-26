<?php
  class  Album{
    public $idAlbum = "";
    public $nomeAlbum = "";
    public $tipoAlbum = "";
    public $annoUscita = "";
    public $immagineAlbum = "";
    public $testoAlbum = "";

    public function __construct($idAlbum,$nomeAlbum,$tipoAlbum,$annoUscita,$immagineAlbum,$testoAlbum){
      $this->idAlbum = $idAlbum;
      $this->nomeAlbum = $nomeAlbum;
      $this->tipoAlbum = $tipoAlbum;
      $this->annoUscita = $annoUscita;
      $this->immagineAlbum = $immagineAlbum;
      $this->testoAlbum = $testoAlbum;
    }

    public function getIdAlbum(){
      return $this->idAlbum;
    }

    public function getNomeAlbum(){
      return $this->nomeAlbum;
    }

    public function getTipoAlbum(){
      return $this->tipoAlbum;
    }

    public function getAnnoUscita(){
      return $this->annoUscita;
    }

    public function getImmagineAlbum(){
      return $this->immagineAlbum;
    }

    public function getTestoAlbum(){
      return $this->testoAlbum;
    }
  }
 ?>
