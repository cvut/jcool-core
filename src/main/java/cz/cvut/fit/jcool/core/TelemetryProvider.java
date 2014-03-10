package cz.cvut.fit.jcool.core;

/**
 * A telemetry provider is an object able to externalize its inner values
 * using a telemetry.
 * (Mediator pattern)
 *
 * All the communication to other telemetry aware objects is done by updating
 * values of the telemetry itself.
 *
 * @author ytoh
 */
public interface TelemetryProvider {

    /**
     * Return the telemetry to be used to externalize the state of optimization
     * execution.
     *
     * @return telemetry implementation
     */
    Telemetry[] getTelemetry();
}
