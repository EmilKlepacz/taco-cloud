package sia.tacocloud.controller.rest;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import sia.tacocloud.model.AppUser;
import sia.tacocloud.model.Taco;
import sia.tacocloud.service.TacoService;

@RestController
@RequestMapping(path = "/api/tacos",
        produces = "application/json")
//accepts cross-origin requests from the front-end running at http://tacocloud:8080.
//for test app requests...
@CrossOrigin(origins = "http://tacocloud:8080")
public class TacoController {
    private final TacoService tacoService;

    public TacoController(TacoService tacoService) {
        this.tacoService = tacoService;
    }

    @GetMapping(params = "recent")
    public Page<Taco> recentTacos(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "12") int size) {
        PageRequest pageRequest = PageRequest.of(page, size);
        return tacoService.lastAddedTacos(pageRequest);
    }
}
