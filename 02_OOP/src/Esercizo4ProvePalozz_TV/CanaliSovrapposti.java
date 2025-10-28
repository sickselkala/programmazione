package Esercizo4ProvePalozz_TV;

public class CanaliSovrapposti extends RuntimeException {
    // Costruttore che riceve un messaggio di errore
    public CanaliSovrapposti(String message) {
      super(message);  // Passa il messaggio alla classe base (Exception)
    }

    // Costruttore che riceve una causa (opzionale)
    public CanaliSovrapposti(String message, Throwable cause) {
      super(message, cause);  // Passa sia il messaggio che la causa alla classe base
    }
  }