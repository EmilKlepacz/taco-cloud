package sia.tacocloud.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import sia.tacocloud.model.AppUser;
import sia.tacocloud.model.Role;
import sia.tacocloud.model.Taco;
import sia.tacocloud.model.TacoOrder;

import java.util.List;
import java.util.Optional;

public interface TacoRepository extends CrudRepository<Taco, Long> {
    Optional<Taco> findByName(String name);

    Page<Taco> findAllByOrderByCreatedAtDesc(Pageable pageable);
}
