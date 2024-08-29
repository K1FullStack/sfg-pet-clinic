package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;
import java.util.Set;
import java.util.UUID;

/** Created by jt on 7/18/18. */
public interface OwnerService {

  Owner findByLastName(String lastName);

  Owner findById(UUID id);

  Owner save(Owner owner);

  Set<Owner> findAll();
}
