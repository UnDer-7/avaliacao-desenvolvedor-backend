package com.surittec.avaliacaodesenvolvedor.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Mateus Cardoso
 */
@MappedSuperclass
abstract class BaseModelAbstract implements Serializable {
  private static final long serialVersionUID = 137167500636116327L;

  @Id
  @Getter
  @Setter
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Getter
  @Column(name = "created_at")
  @JsonIgnore
  private final LocalDateTime createdAt = LocalDateTime.now();
}
