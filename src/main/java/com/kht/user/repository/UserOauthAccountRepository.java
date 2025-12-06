package com.kht.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kht.user.entity.UserOauthAccount;

@Repository
public interface UserOauthAccountRepository extends JpaRepository<UserOauthAccount, Long> {

    /**
     * OAuth 제공자와 제공자 ID로 OAuth 계정을 찾습니다.
     *
     * @param provider OAuth 제공자 (google, kakao, naver 등)
     * @param providerId OAuth 제공자에서 제공하는 사용자 고유 ID
     * @return OAuth 계정 정보
     */
    Optional<UserOauthAccount> findByProviderAndProviderId(String provider, String providerId);
}