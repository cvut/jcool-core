package cz.cvut.fit.jcool.core;

/**
 * A telemetry is a value (or set of value) provided or externalized by
 * an object. The externalized values provide clients with a view of
 * the internal state of the server object.
 *
 * (Mediator pattern)
 *
 * @author ytoh
 */
public interface Telemetry<E> {

    /**
     * Retrieve the current externalized value
     *
     * @return externalized value
     */
    E getValue();
}
