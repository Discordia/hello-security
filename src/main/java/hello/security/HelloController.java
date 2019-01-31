package hello.security;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.authentication.Authentication;
import io.micronaut.security.rules.SecurityRule;
import io.reactivex.Single;
import io.swagger.v3.oas.annotations.tags.Tag;


@Secured(SecurityRule.IS_AUTHENTICATED)
@Tag(name = "/hello")
@Controller("/hello")
public class HelloController {
    @Post("/authenticated/{helloId}")
    public Single<? extends HttpResponse> authenticated(Authentication authentication, String helloId) {
        return Single.just(HttpResponse.accepted());
    }
}
