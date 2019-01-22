package hello.security;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.authentication.Authentication;
import io.micronaut.security.rules.SecurityRule;
import io.swagger.v3.oas.annotations.tags.Tag;


@Secured(SecurityRule.IS_AUTHENTICATED)
@Tag(name = "/hello")
@Controller("/")
public class HelloController {
    @Produces(MediaType.TEXT_PLAIN)
    @Post("/authenticated")
    public String authenticated(Authentication authentication, GameReference gameReference) {
        return authentication.getName() + " is authenticated with game reference: " + gameReference;
    }
}
