package org.example.service;


import org.example.dto.WalletDTO;

import java.util.Optional;

public interface WalletService {


    Optional<WalletDTO> findAdminWalletByEmailAndPassword(String email, String password);

    Optional<WalletDTO> findClientWalletByEmailAndPassword(String email, String password);

    Optional<WalletDTO> findExpertWalletByEmailAndPassword(String email, String password);
}
