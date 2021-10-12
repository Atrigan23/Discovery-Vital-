package za.ac.nwu.ac.logic.services.impl;

import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.persistence.MemberType;
import za.ac.nwu.ac.logic.MemberMilesServicesINT;

@Component("MilesServices")
public class MemberMilesServices implements MemberMilesServicesINT {


    @Override
    public MemberType create(MemberType memberType) {
        return null;
    }
}
