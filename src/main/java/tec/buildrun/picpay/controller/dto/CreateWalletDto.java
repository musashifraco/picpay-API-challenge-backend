package tec.buildrun.picpay.controller.dto;

import jakarta.persistence.*;
import tec.buildrun.picpay.entity.Wallet;
import tec.buildrun.picpay.entity.WalletType;

import java.math.BigDecimal;

public record CreateWalletDto(String fullName,
                              String cpfCnpj,
                              String email,
                              String password,
                              WalletType.Enum walletType) {
    public  Wallet toWallet() {
        return new Wallet(
                 fullName,
                 cpfCnpj,
                 email,
                 password,
                 walletType.get()
        );
    }
}
