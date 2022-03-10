package test_API_REST.factoryRequest;

import io.restassured.response.Response;

public interface IRequest {
    Response send (RequestInformation requestInformation);
}
