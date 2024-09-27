package tec.buildrun.picpay.service;

import org.springframework.stereotype.Service;
import tec.buildrun.picpay.client.AuthorizationClient;
import tec.buildrun.picpay.entity.Transfer;
import tec.buildrun.picpay.exception.PicPayException;

@Service
public class AuthorizationService {
    private final AuthorizationClient authorizationClient;

    public AuthorizationService(AuthorizationClient authorizationClient) {
        this.authorizationClient = authorizationClient;
    }

    public boolean isAuthorized(Transfer transfer) {
        var response = authorizationClient.isAuthorized();

        if(response.getStatusCode().isError()) {
            throw new PicPayException();
        }

        return response.getBody().authorized();
    }
}
