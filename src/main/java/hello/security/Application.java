package hello.security;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.tags.Tag;

@OpenAPIDefinition(
        info = @Info(
                title = "Hello Security API",
                version = "1.0",
                description = "Public API for testing Micronat OpenAPI/Swagger for authenticated routes"
        ),
        servers = { @Server(url = "https://example.com") },
        tags = {@Tag(name = "/hello")}
)
public class Application {
    public static void main(String[] args) {
        Micronaut.run(Application.class);
    }
}