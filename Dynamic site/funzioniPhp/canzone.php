<?php
class Canzone{
  public $idCanzone = "";
  public $nomeCanzone = "";
  public $testoCanzone = "";
  public $writtenBy = "";
  public $producedBy = "";
  public $linkVideo = "";
  public $idAlbum = "";

  function __construct($idCanzone,$nomeCanzone,$testoCanzone,$writtenBy,$producedBy,$linkVideo,$idAlbum) {
    $this->idCanzone = $idCanzone;
    $this->nomeCanzone = $nomeCanzone;
    $this->testoCanzone = $testoCanzone;
    $this->writtenBy = $writtenBy;
    $this->producedBy = $producedBy;
    $this->linkVideo = $linkVideo;
    $this->idAlbum = $idAlbum;
  }

  public function getIdCanzone(){
    return $this->idCanzone;
  }

  public function getNomeCanzone(){
    return $this->nomeCanzone;
  }

  public function getTestoCanzone(){
    return $this->testoCanzone;
  }

  public function getTestoAlbum(){
    return $this->testoAlbum;
  }

  public function getWrittenBy(){
    return $this->writtenBy;
  }

  public function getProducedBy(){
    return $this->producedBy;
  }

  public function getLinkVideo(){
    return $this->linkVideo;
  }

  public function getIdAlbum(){
    return $this->idAlbum;
  }
}

?>
