package org.simple.auth.shadow.model;

import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Josip.Mihelko @ Gmail
 */
@Entity
@Cache
@NoArgsConstructor
@EqualsAndHashCode(of = {"id", "accountId", "network"}, callSuper = false)
@ToString(of = {"id", "accountId", "network"}, callSuper = false)
public class OfyShadowToken extends BaseOfyEntity implements IShadowToken {

    @Id
    @Getter
    @Setter
    String id;

    @Getter
    @Setter
    @Index
    Serializable accountId;

    @Getter
    @Setter
    @Id
    String accessToken;

    @Getter
    @Setter
    @Index
    String refreshToken;

    @Getter
    @Setter
    String tokenSecret;

    @Getter
    @Setter
    Date expiresAt;

    @Getter
    @Setter
    @Index
    String clientId;

    @Getter
    String network;
}