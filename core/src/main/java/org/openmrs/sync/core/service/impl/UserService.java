package org.openmrs.sync.core.service.impl;

import org.openmrs.sync.core.entity.light.UserLight;
import org.openmrs.sync.core.repository.OpenMrsRepository;
import org.openmrs.sync.core.service.AbstractSimpleService;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractSimpleService<UserLight> {

    public UserService(final OpenMrsRepository<UserLight> userRepository) {
        super(userRepository);
    }

    @Override
    protected UserLight getFakeEntity(final String uuid) {
        UserLight user = new UserLight();
        user.setUuid(uuid);
        user.setCreator(DEFAULT_USER_ID);
        user.setDateCreated(DEFAULT_DATE);
        user.setSystemId("admin");
        user.setPersonId(1L);
        return user;
    }
}
