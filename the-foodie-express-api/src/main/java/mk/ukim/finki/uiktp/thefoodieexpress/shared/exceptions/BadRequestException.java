package mk.ukim.finki.uiktp.thefoodieexpress.shared.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class BadRequestException extends ResponseStatusException {
    
    public BadRequestException() {
        super(HttpStatus.BAD_REQUEST);
    }
    
    public BadRequestException(String reason) {
        super(HttpStatus.BAD_REQUEST, reason);
    }
}
