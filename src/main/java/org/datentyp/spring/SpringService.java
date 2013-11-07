package org.datentyp.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class SpringService {
    @Autowired
    SpringRepository springRepository;
}
