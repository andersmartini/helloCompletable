package hello.completable;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Completable;
import io.swagger.v3.oas.annotations.tags.Tag;


@Tag(name = "/hello")
@Controller("/hello")
public class HelloQueryController {

    @Get("/completable")
    public Completable Completable() {
        return Completable.complete();
    }
}
