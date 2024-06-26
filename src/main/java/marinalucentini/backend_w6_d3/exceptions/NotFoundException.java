package marinalucentini.backend_w6_d3.exceptions;

import java.util.UUID;

public class NotFoundException extends RuntimeException{

        public NotFoundException(UUID id) {
            super("Record con id " + id + " non trovato!");
        }

}
