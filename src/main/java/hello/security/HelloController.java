package hello.security;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.authentication.Authentication;
import io.micronaut.security.rules.SecurityRule;
import io.reactivex.Single;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.HashMap;
import java.util.Map;


@Secured(SecurityRule.IS_AUTHENTICATED)
@Tag(name = "/hello")
@Controller("/hello")
public class HelloController {
    @Post("/authenticated")
    public Single<HelloResponse> authenticated(Authentication authentication) {
        Map<String, String> properties = new HashMap<>();
        properties.put("key", "value");
        HelloResponse response = new HelloResponse("id", properties);
        return Single.just(response);
    }
}
