class Game implements ComparableContent<Game> {
  private int erscheinungsjahr, preis;
  private String titel, publisher, genre;
  Comparer vergleicher;
  //Grafikkarten mindestanforderung
  public Game(int pErscheinungsjahr, int pPreis, String pTitel, String pPublisher, String pGenre){
    this.vergleicher = new Comparer();
    this.preis = pPreis;
    this.erscheinungsjahr = pErscheinungsjahr;
    this.titel = pTitel;
    this.publisher = pPublisher;
    this.genre = pGenre;
  }
  
  public boolean isGreater(Game pGame, String pAttribut) {
    if (pAttribut.equals("preis")) {
      int pErgebnis = vergleicher.comparePreis(this, pGame);
      if (pErgebnis == 1) return true;
      if (pErgebnis == -1 || pErgebnis == 0) return false;
    }
    if (pAttribut.equals("erscheinungsjahr")) {
      int pErgebnis = vergleicher.comparePreis(this, pGame);
      if (pErgebnis == 1) return true;
      if (pErgebnis == -1 || pErgebnis == 0) return false;
    }
    if (pAttribut.equals("titel")) {
      int pErgebnis = vergleicher.comparePreis(this, pGame);
      if (pErgebnis == 1) return true;
      if (pErgebnis == -1 || pErgebnis == 0) return false;
    }
    if (pAttribut.equals("publisher")) {
      int pErgebnis = vergleicher.comparePreis(this, pGame);
      if (pErgebnis == 1) return true;
      if (pErgebnis == -1 || pErgebnis == 0) return false;
    }
    if (pAttribut.equals("genre")) {
      int pErgebnis = vergleicher.comparePreis(this, pGame);
      if (pErgebnis == 1) return true;
      if (pErgebnis == -1 || pErgebnis == 0) return false;
    }
    return false;
  }

  public boolean isEqual(Game pGame, String pAttribut) {
    if (pAttribut.equals("preis")) {
      int pErgebnis = vergleicher.comparePreis(this, pGame);
      if (pErgebnis == 0) return true;
      if (pErgebnis == -1 || pErgebnis == 1) return false;

    }
    if (pAttribut.equals("erscheinungsjahr")) {
      int pErgebnis = vergleicher.comparePreis(this, pGame);
      if (pErgebnis == 0) return true;
      if (pErgebnis == -1 || pErgebnis == 1) return false;

    }
    if (pAttribut.equals("titel")) {
      int pErgebnis = vergleicher.comparePreis(this, pGame);
      if (pErgebnis == 0) return true;
      if (pErgebnis == -1 || pErgebnis == 1) return false;

    }
    if (pAttribut.equals("publisher")) {
      int pErgebnis = vergleicher.comparePreis(this, pGame);
      if (pErgebnis == 0) return true;
      if (pErgebnis == -1 || pErgebnis == 1) return false;

    }
    if (pAttribut.equals("genre")) {
      int pErgebnis = vergleicher.comparePreis(this, pGame);
      if (pErgebnis == 0) return true;
      if (pErgebnis == -1 || pErgebnis == 1) return false;

    }
    return false;
  }

  public boolean isLess(Game pGame, String pAttribut) {
    if (pAttribut.equals("preis")) {
      int pErgebnis = vergleicher.comparePreis(this, pGame);
      if (pErgebnis == -1) return true;
      if (pErgebnis == 1 || pErgebnis == 0) return false;
    }
    if (pAttribut.equals("erscheinungsjahr")) {
      int pErgebnis = vergleicher.comparePreis(this, pGame);
      if (pErgebnis == -1) return true;
      if (pErgebnis == 1 || pErgebnis == 0) return false;
    }
    if (pAttribut.equals("titel")) {
      int pErgebnis = vergleicher.comparePreis(this, pGame);
      if (pErgebnis == -1) return true;
      if (pErgebnis == 1 || pErgebnis == 0) return false;
    }
    if (pAttribut.equals("publisher")) {
      int pErgebnis = vergleicher.comparePreis(this, pGame);
      if (pErgebnis == -1) return true;
      if (pErgebnis == 1 || pErgebnis == 0) return false;
    }
    if (pAttribut.equals("genre")) {
      int pErgebnis = vergleicher.comparePreis(this, pGame);
      if (pErgebnis == -1) return true;
      if (pErgebnis == 1 || pErgebnis == 0) return false;
    }
    return false;
  }

  public int getErscheinungsjahr(){
    return erscheinungsjahr;
  }
  
  public int getPreis(){
    return preis;
  }
 
  public String getPublisher(){
    return publisher;
  }
  
  public String getGenre(){
    return genre;
  }
  
  public String getTitel(){
    return titel;
  }
}