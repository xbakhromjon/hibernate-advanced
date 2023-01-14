package uz.bakhromjon.basictypesmappings.generators;

import org.hibernate.Session;
import org.hibernate.tuple.ValueGenerator;
import uz.bakhromjon.basictypesmappings.auth.LoggedUser;

public class LoggedUserGenerator
        implements ValueGenerator<String> {

    @Override
    public String generateValue(Session session, Object owner) {
        return LoggedUser.get();
    }
}


