package org.omg.sysml.metamodel;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface Function extends Behavior, MofObject {
    Collection<? extends Expression> getExpression();

    Parameter getResult();
}