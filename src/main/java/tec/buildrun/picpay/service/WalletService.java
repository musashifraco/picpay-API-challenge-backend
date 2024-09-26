package tec.buildrun.picpay.service;

import org.springframework.stereotype.Service;
import tec.buildrun.picpay.controller.dto.CreateWalletDto;
import tec.buildrun.picpay.entity.Wallet;
import tec.buildrun.picpay.exception.WalletDataAlreadyExistsException;
import tec.buildrun.picpay.repository.WalletRepository;

@Service
public class WalletService {
    private final WalletRepository walletRepository;

    public WalletService(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    public Wallet createWallet(CreateWalletDto dto) {
        var walletDb = walletRepository.findByCpfCnpjOrEmail(dto.cpfCnpj(), dto.cpfCnpj());

        if(walletDb.isPresent()) {
            throw  new WalletDataAlreadyExistsException("Cpf pr Email already exists");
        }

        return walletRepository.save(dto.toWallet());
    }
}
