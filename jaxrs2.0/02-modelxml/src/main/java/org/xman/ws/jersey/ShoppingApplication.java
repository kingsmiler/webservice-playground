package org.xman.ws.jersey;

import org.xman.ws.jersey.resources.MessageResource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/services")
public class ShoppingApplication extends Application {
    private Set<Object> singletons = new HashSet<Object>();

    public ShoppingApplication() {
        singletons.add(new MessageResource());
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
