package tec.buildrun.picpay.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tec.buildrun.picpay.controller.dto.CreateWalletDto;
import tec.buildrun.picpay.entity.Wallet;
import tec.buildrun.picpay.service.WalletService;

@RestController
public class WalletController {
    private final WalletService walletService;

    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    @PostMapping("/wallets")
    public ResponseEntity<Wallet> createWallet(@RequestBody CreateWalletDto dto) {
        var wallet = walletService.createWallet(dto);

        return  ResponseEntity.ok(wallet);
    }

}
