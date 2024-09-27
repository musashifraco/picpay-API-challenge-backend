package tec.buildrun.picpay.controller.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import tec.buildrun.picpay.entity.Wallet;
import tec.buildrun.picpay.entity.WalletType;

import java.math.BigDecimal;

public record CreateWalletDto(@NotBlank String fullName,
                              @NotBlank String cpfCnpj,
                              @NotBlank String email,
                              @NotBlank String password,
                              @NotNull WalletType.Enum walletType) {
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
